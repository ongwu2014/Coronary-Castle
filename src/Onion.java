
public class Onion extends Burger {

	Burger burger;

    public Onion(Burger burger) {
        this.burger = burger;
    }

    public Onion() { }

	public String getDescription() {
        return burger.getDescription() + ", Onion";
    }

    public double cost() {
        return 0.00 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(15);
    }

	public double price() {
		return 0.00;
	}

}
