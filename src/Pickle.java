
public class Pickle extends Burger {

	Burger burger;

    public Pickle(Burger burger) {
        this.burger = burger;
    }

    public Pickle() { }

	public String getDescription() {
        return burger.getDescription() + ", Pickle";
    }

    public double cost() {
        return 0.00 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(16);
    }

	public double price() {
		return 0;
	}

}
