public class QuadrupleBypass extends Burger {

    public QuadrupleBypass () {
        description = "Quadruple Bypass: two pound burger";
    }
    
    public double cost () {
        return 8.00;
    }
    
    public MenuItemID menuItemID () {
        return new MenuItemID(4);
    }
}
