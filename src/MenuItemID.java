public class MenuItemID {
    int value;
    
    public MenuItemID (int value) {
    	this.value = value;
    }
    
    public int getValue() {
    	return value;
    }
    
    //Override methods in hashmap to work with our code construction.
    @Override
    public boolean equals (Object object) {
    	if ((object instanceof MenuItemID) && (((MenuItemID) object).getValue() == this.value)){
    		return true;
    	}
    	return false;
    }
    
    @Override
    public int hashCode() {
    	int result = 0;
    	result = (int) (value + 2);
    	return result;
    }
    
}
