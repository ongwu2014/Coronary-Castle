

class Money
{
	double value;
	
	public Money(){
		this.value = 0;
	}
	
	public Money(double value){
		this.value = value;
	}

	public Money times(int quantity) {
		Money timesMoney = new Money (value * quantity);
		return timesMoney;
	}

	public Money minus(Money total) {
		this.value = value - total.value;
		return this;
	}

	public Money add(Money subTotal) {
		this.value = value + subTotal.value;
		return this;
	}
}