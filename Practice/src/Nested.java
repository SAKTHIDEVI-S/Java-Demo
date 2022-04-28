
class Outer {
	public static int a = 10;
	public void out(int b) {
		System.out.println("b is"+b);
	}
	class Nest{
		public void func() {
			System.out.println("val of a : ");
			
		}
		
	}
	class Nonstaticnest {
		public void fun() {
			int b=10;
			System.out.println("val of b : "+b);
		}
	}
}
public class Nested{
	public static void main(String[] args)
	{
		Outer o = new Outer();
		//Outer.Nest o2 = new Outer.Nest();//static
		Outer.Nest o2 = o.new Nest();
		Outer.Nonstaticnest o1 = o.new Nonstaticnest(); 
		o2.func();
		o1.fun();
	}
}