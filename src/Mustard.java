
public class Mustard extends Burger {
	Burger burger;

    public Mustard(Burger burger) {
        this.burger = burger;
    }

    public Mustard() { }

	public String getDescription() {
        return burger.getDescription() + ", Mustard";
    }

    public double cost() {
        return 0.00 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(10);
    }

	public double price() {
		return 0.00;
	}

}
