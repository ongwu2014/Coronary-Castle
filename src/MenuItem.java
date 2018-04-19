import java.util.HashMap;
import java.util.Map;

public class MenuItem 
{

	private Map <MenuItemID, ProductDescription> descriptions = new HashMap <MenuItemID , ProductDescription>();
	
	public MenuItem()
	{
		//Puts each menu item in the hashmap at the start of the program.
	    descriptions.put(new MenuItemID(new Bypass().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new Bypass().menuItemID().value), 
	    				new Money(new Bypass().cost()), new Bypass().description));
	    
	    descriptions.put(new MenuItemID(new DoubleBypass().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new DoubleBypass().menuItemID().value), 
	    				new Money(new DoubleBypass().cost()), new DoubleBypass().description));
	    
	    descriptions.put(new MenuItemID(new TripleBypass().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new TripleBypass().menuItemID().value), 
	    				new Money(new TripleBypass().cost()), new TripleBypass().description));
	    
	    descriptions.put(new MenuItemID(new QuadrupleBypass().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new QuadrupleBypass().menuItemID().value), 
	    				new Money(new QuadrupleBypass().cost()), new QuadrupleBypass().description));
	    
	    descriptions.put(new MenuItemID(new FriedEgg().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new FriedEgg().menuItemID().value), 
	    				new Money(new FriedEgg().price()), new FriedEgg().description));
	    
	    descriptions.put(new MenuItemID(new HamSlice().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new HamSlice().menuItemID().value), 
	    				new Money(new HamSlice().price()), new HamSlice().description));
	    
	    descriptions.put(new MenuItemID(new Cheese().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new Cheese().menuItemID().value), 
	    				new Money(new Cheese().price()), new Cheese().description));
	    
	    descriptions.put(new MenuItemID(new FriedOnionRings().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new FriedOnionRings().menuItemID().value), 
	    				new Money(new FriedOnionRings().price()), new FriedOnionRings().description));
	    
	    descriptions.put(new MenuItemID(new FrenchFries().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new FrenchFries().menuItemID().value), 
	    				new Money(new FrenchFries().price()), new FrenchFries().description));
	    
	    descriptions.put(new MenuItemID(new Mustard().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new Mustard().menuItemID().value), 
	    				new Money(new Mustard().price()), new Mustard().description));
	    
	    descriptions.put(new MenuItemID(new Mayonnaise().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new Mayonnaise().menuItemID().value), 
	    				new Money(new Mayonnaise().price()), new Mayonnaise().description));
	    
	    descriptions.put(new MenuItemID(new Ketchup().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new Ketchup().menuItemID().value), 
	    				new Money(new Ketchup().price()), new Ketchup().description));
	    
	    descriptions.put(new MenuItemID(new Lettuce().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new Lettuce().menuItemID().value), 
	    				new Money(new Lettuce().price()), new Lettuce().description));
	    
	    descriptions.put(new MenuItemID(new Tomato().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new Tomato().menuItemID().value), 
	    				new Money(new Tomato().price()), new Tomato().description));
	    
	    descriptions.put(new MenuItemID(new Onion().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new Onion().menuItemID().value), 
	    				new Money(new Onion().price()), new Onion().description));
	    
	    descriptions.put(new MenuItemID(new Pickle().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new Pickle().menuItemID().value), 
	    				new Money(new Pickle().price()), new Pickle().description));
	    
	    descriptions.put(new MenuItemID(new JalapenoPeppers().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new JalapenoPeppers().menuItemID().value), 
	    				new Money(new JalapenoPeppers().price()), new JalapenoPeppers().description));
	    
	    descriptions.put(new MenuItemID(new ThirtyTwoOunces().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new ThirtyTwoOunces().menuItemID().value), 
	    				new Money(new ThirtyTwoOunces().cost()), new ThirtyTwoOunces().description));
	    
	    descriptions.put(new MenuItemID(new FortyEightOunces().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new FortyEightOunces().menuItemID().value), 
	    				new Money(new FortyEightOunces().cost()), new FortyEightOunces().description));
	    
	    descriptions.put(new MenuItemID(new BladderBuster().menuItemID().value), 
	    		new ProductDescription(new MenuItemID(new BladderBuster().menuItemID().value), 
	    				new Money(new BladderBuster().cost()), new BladderBuster().description));	
	}
	
	public ProductDescription getProductDescription (MenuItemID id)
	{
		return descriptions.get(id);
	}
	
}