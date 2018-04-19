import java.util.Scanner;

public class Cashier {

	//this class separates the controller from the rest of the code
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		CoronaryCastleRestaurant restaurant = new CoronaryCastleRestaurant();
		Register register = restaurant.getRegister();
		
		System.out.println("Enter item ID followed by toppings. Enter \"ENDSALE\" when complete:");
		
		Scanner input = new Scanner (System.in);
		
		String lineItem = input.nextLine();

		while (!lineItem.equalsIgnoreCase("EndSale")) {
	
			MenuItemID id = new MenuItemID (Integer.parseInt(lineItem));
			register.enterItem(id, 1);
			lineItem = input.nextLine();
		}
		
		register.endSale();
		System.out.printf("Your total is :%.2f",register.currentSale.getTotal().value);
		System.out.println();
		System.out.print("Enter payment amount: $");
		double money = input.nextDouble();
		register.currentSale.makePayment(new Money (money));
	    System.out.println();
	    System.out.printf("Balance: $%.2f", register.currentSale.getBalance().value);

	    input.close();
	}

}
