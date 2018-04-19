
public class ToppingFactory {

private static ToppingFactory instance;
    
    //create topping factory as a singleton
	public static synchronized ToppingFactory getInstance() {
        if (instance == null) {
            instance = new ToppingFactory();
        } 
        return instance;
	}
	
	//wraps a burger with a condiment object
	public static Burger getCondiment (Burger burger, String className) {
		switch (className) {
	    case "5":
	    	return new HamSlice (burger);
	    case "6":
	    	return new FriedEgg (burger);
	    case "7":
	    	return new Cheese (burger);
	    case "8":
	    	return new FriedOnionRings (burger);
	    case "9":
	    	return new FrenchFries (burger);
	    case "10":
	    	return new Mustard (burger);
	    case "11":
	    	return new Mayonnaise (burger);
	    case "12":
	    	return new Ketchup (burger);
	    case "13":
	    	return new Lettuce (burger);
	    case "14":
	    	return new Tomato (burger);
	    case "15":
	    	return new Onion (burger);
	    case "16":
	    	return new Pickle (burger);
	    case "17":
	    	return new JalapenoPeppers (burger);
	    }
		return burger;
	}
}
