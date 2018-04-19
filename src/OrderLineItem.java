
public class OrderLineItem {

	private int quantity;
	ProductDescription description;
	
	public OrderLineItem (ProductDescription desc, int quantity)
	{
		this.description = desc;
		this.quantity = quantity;
	}
	
	//gets the sub-total of all the order line items using the product description
	public Money getSubtotal()
	{
		Money subtotal = description.getPrice().times(quantity);
		return subtotal;
	}
}
