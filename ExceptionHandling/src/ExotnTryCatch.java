import java.util.Scanner;
public class ExotnTryCatch {
	public static void main(String []args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			int num3 = num1+num2;
			System.out.println("Result " +num3);
		} //catch (Exception ex) {
			//System.out.println("Addition can be made only with integers");
		//}
		finally {
			System.out.println("Final is executed regardless of exception is thrown or not");
		}
		System.out.println("To check");
	}

}
