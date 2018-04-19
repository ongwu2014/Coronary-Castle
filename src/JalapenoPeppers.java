
public class JalapenoPeppers extends Burger {

	Burger burger;

    public JalapenoPeppers(Burger burger) {
        this.burger = burger;
    }

    public JalapenoPeppers() { }

	public String getDescription() {
        return burger.getDescription() + ", Jalapeno peppers";
    }

    public double cost() {
        return 0.00 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(17);
    }

	public double price() {
		return 0.00;
	}

}
