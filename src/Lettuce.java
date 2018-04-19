
public class Lettuce extends Burger {

	Burger burger;

    public Lettuce(Burger burger) {
        this.burger = burger;
    }

    public Lettuce() { }

	public String getDescription() {
        return burger.getDescription() + ", Lettuce";
    }

    public double cost() {
        return 0.00 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(13);
    }

	public double price() {
		return 0.00;
	}

}
