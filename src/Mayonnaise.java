
public class Mayonnaise extends Burger {

	Burger burger;

    public Mayonnaise(Burger burger) {
        this.burger = burger;
    }

    public Mayonnaise() { }

	public String getDescription() {
        return burger.getDescription() + ", Mayonnaise";
    }

    public double cost() {
        return 0.00 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(11);
    }

	public double price() {
		return 0.00;
	}

}
