
public class FortyEightOunces extends Drinks {

	public FortyEightOunces () {
        description = "Generic Soda (42 Ounces)";
    }
	@Override
	public double cost() {
		return 3.00;
	}

	@Override
	public MenuItemID menuItemID() {
		return new MenuItemID (19);
	}
}
