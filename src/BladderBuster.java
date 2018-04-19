public class BladderBuster extends Drinks {

	public BladderBuster () {
        description = "Bladder Buster (64 Ounces)";
    }
	@Override
	public double cost() {
		return 4.00;
	}

	@Override
	public MenuItemID menuItemID() {
		return new MenuItemID (20);
	}
}
