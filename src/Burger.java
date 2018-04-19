public abstract class Burger {
    String description = "Unknown burger size";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
    
    public abstract MenuItemID menuItemID ();
}
