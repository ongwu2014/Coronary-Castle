
public class CoronaryCastleRestaurant {

	private MenuItem menuItem = new MenuItem();
	private Register register = new Register (menuItem);
	
	//method gets a singleton instance of a register
	public Register getRegister()
	{
		return register.getInstance();
	}
}
