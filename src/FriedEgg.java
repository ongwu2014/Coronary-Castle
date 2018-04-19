public class FriedEgg extends ToppingDecorator{
    Burger burger;

    public FriedEgg(Burger burger) {
        this.burger = burger;
    }

    public FriedEgg() { }

	public String getDescription() {
        return burger.getDescription() + ", Fried egg";
    }

    public double cost() {
        return 0.75 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(6);
    }

	public double price() {
		return 0.75;
	}
}
