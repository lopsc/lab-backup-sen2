public class Coffee extends Drink {
	protected boolean isSweet;

	public Coffee(String name, int price, int volume, boolean isSweet) {
		super(name, price, volume);
		this.isSweet = isSweet;
	}

	public String toString() {
		if (isSweet) 
			return super.toString() + ", sweet";
		else 
			return super.toString() + ", not sweet";
	}

	public void setPrice(int price) {
		if (price < 5) 
			this.price = 5;
		else
			super.setPrice(price);
	}
}

