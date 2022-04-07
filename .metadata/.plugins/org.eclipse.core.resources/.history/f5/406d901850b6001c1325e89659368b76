package supermarket.products;
//inheritance
public class BeverageProduct extends GroceryProduct implements Drinkable {
	private SugarLevel SugarLevel;
public BeverageProduct(String name, double price, double discount, SugarLevel SugarLevel) {
		super(name, price, discount);
		this.SugarLevel = SugarLevel;
		// TODO Auto-generated constructor stub
	}
public SugarLevel getSugarLevel() {
	return SugarLevel;
}
public void setSugarLevel(SugarLevel sugarLevel) {
	SugarLevel = sugarLevel;
}
//overriding toString
	public String toString() {
		return super.toString() + "Sugar Level: " + SugarLevel;
		
	}
@Override
public boolean isHealthy() {
	// TODO Auto-generated method stub
	return SugarLevel!= supermarket.products.SugarLevel.ADDED_SUGAR;
}

}
