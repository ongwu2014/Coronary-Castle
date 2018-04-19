import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private List<OrderLineItem> lineItems = new ArrayList<OrderLineItem>();
	//private Date date = new Date();
	private boolean isComplete = false;
	private Payment payment;
	private int beginPos = 0;
	private int endPos = 0;
	public Money total = new Money (0);
	
	public Money getBalance()
	{
		return payment.getAmount().minus(getTotal());
	}

	public void becomeComplete()
	{
		isComplete = true;
	}
	
	public boolean isComplete()
	{
		return isComplete;
	}
	
	public void makeLineItem (ProductDescription desc, int quantity)
	{
		lineItems.add(new OrderLineItem (desc, quantity));
		
	}
	
	public Money getTotal()
	{
		
		return total;
	}
	
	public void makePayment (Money cashTendered){
		payment = new Payment (cashTendered);
	}

	/* When an order is completed, this method is called to prepare the order. */
	public ArrayList<String> prepOrder() throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		int i = 0;
		String className = "";
		total.value = 0.0;
		ArrayList<String> items = new ArrayList<>();
		/* This loop iterates through the order line items and makes use of the 
		 * decorator pattern to get information about the burgers */
		while (i < lineItems.size()) {
			OrderLineItem orderID = lineItems.get(i);
			if (orderID.description.id.value == 1) {
				className = "Bypass";
			} else if (orderID.description.id.value == 2) {
				className = "DoubleBypass";
			} else if (orderID.description.id.value == 3) {
				className = "TripleBypass";
			} else {
				className = "QuadrupleBypass";
			}
			i++;
			
			//selects the appropriate burger class dynamically
			Burger burger = (Burger) Class.forName(className).newInstance();
			
			/* Gets the drinks from the order line items  */
			while (i < lineItems.size()){
				int coder = lineItems.get(i).description.id.value;
				if (coder <= 4) {
					break;
				}
				if (coder > 17) {
					Drinks drink = null;
					switch (coder) {
					case 18:
						drink = new ThirtyTwoOunces();
						break;
					case 19:
						drink = new FortyEightOunces();
						break;
					case 20:
						drink = new BladderBuster();
					}
					items.add(drink.getDescription() 
							+ " $" + drink.cost());
					//get total here 
					total = total.add(new Money (drink.cost()));
				} else {
					String itemID = Integer.toString(lineItems.get(i).description.id.value);
				    burger = ToppingFactory.getCondiment(burger, itemID);
				}
				
				i++;
			}
			
			
			items.add(burger.getDescription() 
					+ " $" + burger.cost());
			//get total here 
			total = total.add(new Money (burger.cost()));
			
			
		}
		
		return items;
		
	}

	public ArrayList<Integer> orderAtIndex(int type) {
		int i = 0;
		int position = 0;
		ArrayList<Integer> items = new ArrayList<>();
		while (i < lineItems.size()) {
			if (position == type) {
				int j = i;
				OrderLineItem orderID = lineItems.get(j);
				int value = orderID.description.id.value;
				while (value != 1 && value != 2 && value != 3 && value != 4) {
					items.add(orderID.description.id.value);
					j++;
					if (j < lineItems.size()) {
						orderID = lineItems.get(j);
						value = orderID.description.id.value;
					} else {
						break;
					}
				}
				break;
			} else {
				OrderLineItem orderID = lineItems.get(i);
				int value = orderID.description.id.value;
				if (value == 1 || value == 2 || value == 3 || value == 4) {
					position++;
				}
			}
			i++;
		}
		return items;
	}

	public void modifyOrder(int type, Boolean[] turner) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		int i = 0;
		int position = 0;
		int j = 0;
		while (i < lineItems.size()) {
			if (position == type) {
				break;
			} else {
				OrderLineItem orderID = lineItems.get(i);
				int value = orderID.description.id.value;
				if (value == 1 || value == 2 || value == 3 || value == 4) {
					position++;
				}
			}
			i++;
		}
		beginPos = i - 1;
		int value = lineItems.get(beginPos).description.id.value;
		lineItems.remove(beginPos);
		value = lineItems.get(beginPos).description.id.value;
		while (value > 4) {
			lineItems.remove(beginPos);
			value = lineItems.get(beginPos).description.id.value;
		}

	}
}
