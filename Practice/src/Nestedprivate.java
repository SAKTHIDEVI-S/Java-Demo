class Outers {

	public void fun() {
		System.out.println("Outer class");
	}
	static class Inner {
		private int a;
		public void f() {
			System.out.println("Inner class");
		}		
	}
	public static void print(int a) {
	System.out.println("a:" +a);
	}
}

public class Nestedprivate{
	public static void main(String[] args)
	{
	//Outers out = new Outers();
	Outers.Inner in = new Outers.Inner();
	Outers.print(5);
	in.f();
	}
}