
public class Ketchup extends Burger {

	Burger burger;

    public Ketchup(Burger burger) {
        this.burger = burger;
    }

    public Ketchup() { }

	public String getDescription() {
        return burger.getDescription() + ", Ketchup";
    }

    public double cost() {
        return 0.00 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(12);
    }

	public double price() {
		return 0.00;
	}

}
