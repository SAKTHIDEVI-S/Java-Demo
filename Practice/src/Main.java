class A
{
	int a=10;
    void method_in_A()
    {
        System.out.println("I am from Parent Class A");
    }
}
 class B extends A
{

    void method_in_B()
    {
        System.out.println("I am from child of Parent Class A");
    }
}
 class c  extends B
{
   void method_in_C()
    {
        System.out.println("I am from Child  Class c Parent B");
        method_in_A();//calling the class A method
        System.out.println("Value of a is: " +a); //accessing variable of class A
    }

}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		 c instance = new c();
		instance.method_in_C();
	}
}

