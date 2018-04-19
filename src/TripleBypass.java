public class TripleBypass extends Burger {

    public TripleBypass () {
        description = "Triple Bypass: one and a half pound burger";
    }
    
    public double cost () {
        return 6.50;
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(3);
    }
}
