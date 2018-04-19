public abstract class Drinks {
    String description = "Unknown soda size";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
    
    public abstract MenuItemID menuItemID ();

}
