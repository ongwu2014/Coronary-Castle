public class HamSlice extends ToppingDecorator {
    Burger burger;
    
    public HamSlice () {}

    public HamSlice(Burger burger) {
        this.burger = burger;
    }

    public String getDescription() {
        return burger.getDescription() + ", Ham slice";
    }

    public double price(){
    	return 1.00;
    }
    
    public double cost() {
        return 1.00 + burger.cost();
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(5);
    }
}
