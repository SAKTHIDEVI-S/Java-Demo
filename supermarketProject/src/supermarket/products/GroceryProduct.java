package supermarket.products;
//abstraction //abstract keyword
public abstract class GroceryProduct {
	//encapsulation 
	private String name;
	private double price;
	private double discount;
	//concrete methods
	public GroceryProduct(String name, double price, double discount) {
		//this keyword - currenct class instance variable
		this.name = name;
		this.price = price;
		this.discount = discount;
		
	}
	//setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getActualPrice() {
		return (price -(price*(discount/100)));
	}
	public String toString() {
		return ("Name: "+ name + "\n" + "Price: " + price + "\n" + "Discount: " + discount + "\n");
	}
}
