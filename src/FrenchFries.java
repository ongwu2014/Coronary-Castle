public class FrenchFries extends ToppingDecorator {
    Burger burger;

    public FrenchFries(Burger burger) {
        this.burger = burger;
    }

    public FrenchFries() { }

	public String getDescription() {
        return burger.getDescription() + ", French fries";
    }

    public double cost() {
        return 0.75 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(9);
    }

	public double price() {
		return 0.75;
	}
}
