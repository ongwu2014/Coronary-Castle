
public class ProductDescription {

	MenuItemID id;
	private Money price;
	private String description;
	
	//constructor
	public ProductDescription( MenuItemID id , Money price, String description)
	{
		this.id = id;
		this.price = price;
		this.description = description;
		
	}
	
	public MenuItemID getItemID()
	{
		return id;
	}
	
	public Money getPrice()
	{
		return price;
	}
	
	
	public String getDescription()
	{
		return description;
	}
}
