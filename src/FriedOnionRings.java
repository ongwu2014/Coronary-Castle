public class FriedOnionRings extends ToppingDecorator {
    Burger burger;

    public FriedOnionRings(Burger burger) {
        this.burger = burger;
    }

    public FriedOnionRings() { }

	public String getDescription() {
        return burger.getDescription() + ", Fried onion rings (served on the sandwich)";
    }

    public double cost() {
        return 0.75 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(8);
    }

	public double price() {
		return 0.75;
	}
}
