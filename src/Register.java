import java.util.ArrayList;


public class Register {

	private MenuItem menuItem;
	public Order currentSale;
	public static Register instance;
	
	public Register (MenuItem menuItem)
	{
		this.menuItem = menuItem;
		
	}
	
	public void makeNewOrder () {
		currentSale = new Order();
	}
	
	public ArrayList<String> endSale() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		currentSale.becomeComplete();
		return currentSale.prepOrder();
	}
	
	
	public void enterItem( MenuItemID id, int quantity)
	{
		ProductDescription desc = menuItem.getProductDescription (id);
		currentSale.makeLineItem (desc, quantity);
	}
	
	public void makePayment (Money cashTendered)
	{
		currentSale.makePayment (cashTendered);
	}
	
	public double getTotal () {
		return currentSale.getTotal().value;
	}

	//make register a singleton
	public Register getInstance() {
		if (instance == null) {
			instance = new Register(menuItem);
		}
		return instance;
	}

	public ArrayList<Integer> getOrderAtIndex(int type) {
		 return currentSale.orderAtIndex (type);
	}

	public void modifyOrder(int type, Boolean[] turner) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		currentSale.modifyOrder(type, turner);
		
	}
	
}
