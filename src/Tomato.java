
public class Tomato extends Burger {

	Burger burger;

    public Tomato(Burger burger) {
        this.burger = burger;
    }

    public Tomato() { }

	public String getDescription() {
        return burger.getDescription() + ", Tomato";
    }

    public double cost() {
        return 0.00 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(14);
    }

	public double price() {
        return 0.00;
	}

}
