import java.util.ArrayList;
import java.util.Arrays;


public class UIInterceptor {
	
	private Register register;
	private CoronaryCastleRestaurant restaurant;

	public UIInterceptor() {
		restaurant = new CoronaryCastleRestaurant();
		register = restaurant.getRegister();
	}
	
	public void addItem (int itemID) {
		MenuItemID id = new MenuItemID (itemID);
		register.enterItem(id, 1);
	}

	public String[] getLineItems() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		ArrayList<String> list = register.endSale();
		int itemCounter = 0;
		String[] items = new String [100];
		for (int i = 0; i < list.size(); i++) {
			String lineItem = list.get(i);
			String[] lineItems = lineItem.split(",");
			for (int j = 0; j < lineItems.length; j++) {
				items[itemCounter] = lineItems[j];
				itemCounter++;
			}
		}
		
		String [] mainItem = new String [itemCounter];
		for (int i = 0; i < mainItem.length; i++) {
			mainItem[i] = items [i];
		}
		return mainItem;
	}

	public void makeNewOrder() {
		register.makeNewOrder();
	}
	
	public double getTotal() {
		 return register.getTotal();
	}
	
	public double getTax() {
		return 0.065*getTotal();
	}
	
	public double getNetTotal () {
		return getTotal() + getTax();
	}

	public double processPayment(double cash, boolean card) {
		double tenderAmount = 0.0;
		double amount = getNetTotal();
		if (card) {
			double credit = amount - cash;
			if  (credit > 20.0) {
				return -1;
			}
			tenderAmount = cash + credit;
		} else {
			tenderAmount = cash;
		}
		
		return tenderAmount - amount;
		
	}

	public Boolean[] getOrderAtIndex(int type) {
		ArrayList<Integer> list = register.getOrderAtIndex(type);
		
		Boolean[] items = new Boolean [16]; 
		Arrays.fill(items, Boolean.FALSE);
		for (int i = 0; i < items.length; i++) {
			if (list.contains(i+5)) {
				items[i] = true;
			}
		}
		
		return items;
		
	}

	public void modifyOrder(int type, Boolean[] turner) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		register.modifyOrder(type, turner);
		MenuItemID id = new MenuItemID (type);
		register.enterItem(id, 1);
		for (int i = 0; i < turner.length; i++) {
			if (turner[i]) {
				id = new MenuItemID (i + 5);
				register.enterItem(id, 1);
			}
		}
	}
	
	
}
