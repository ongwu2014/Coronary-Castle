public class Cheese extends ToppingDecorator {
    Burger burger;

    public Cheese(Burger burger) {
        this.burger = burger;
    }

    public Cheese() { }

	public String getDescription() {
        return burger.getDescription() + ", Cheese";
    }

    public double cost() {
        return 0.50 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(7);
    }

	public double price() {
		return 0.50;
	}
}
