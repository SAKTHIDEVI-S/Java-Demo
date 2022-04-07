package supermarket.products;

public class Cart {
	//static in main - that's why main doesn't need any object to be called 
	//static - used to make it object unspecific
	public static void main(String[] args) {
		//new keyword
		BeverageProduct Sprite = new BeverageProduct("Sprite", 2.5, 10, SugarLevel.LIGHT);
		BeverageProduct Cola = new BeverageProduct("Cola",4,0,SugarLevel.ADDED_SUGAR);
		
		DairyProduct Yogu = new DairyProduct("Yogu", 5.5, 15, Fat.SKIMMED);
		DairyProduct Curd = new DairyProduct("Curd", 4, 25, Fat.FULLCREAM);
		//check healthy
		System.out.println("----HEALTHINESS----");
		System.out.println(Sprite.isHealthy());
		System.out.println(Cola.isHealthy());
		
		System.out.println("----ACTUAL PRICE----");
		System.out.println(Sprite.getActualPrice());
		System.out.println(Cola.getActualPrice());
		System.out.println(Yogu.getActualPrice());
		System.out.println(Curd.getActualPrice());
		
		//print method automatically calls overriden toString
		System.out.println("----PRINT PRODUCTS----");
		System.out.println(Sprite);
		System.out.println(Cola);
		System.out.println(Yogu);
		System.out.println(Curd);
	}
}
