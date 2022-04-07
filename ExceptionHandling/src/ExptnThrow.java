import java.util.Scanner;
public class ExptnThrow {
	public static void main(String []args) throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Your age is "+age);
		
		if(age<18) {
			throw new Exception("Age is under 18. Cannot Vote");	
		}
		else {
			System.out.println("Can Vote");
		}
	}

}
