public class Bypass extends Burger {
	
    public Bypass () {
        description = "Bypass: half pound burger";
    }
    
    public double cost () {
        return 3.50;
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(1);
    }
}
