
public class ThirtyTwoOunces extends Drinks{

	public ThirtyTwoOunces () {
        description = "Generic Soda (32 Ounces)";
    }
	@Override
	public double cost() {
		return 2.00;
	}

	@Override
	public MenuItemID menuItemID() {
		return new MenuItemID (18);
	}

}
