public class DoubleBypass extends Burger {
	
    public DoubleBypass () {
        description = "Double Bypass: one pound burger";
    }
    
    public double cost () {
        return 5.00;
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(2);
    }
}
