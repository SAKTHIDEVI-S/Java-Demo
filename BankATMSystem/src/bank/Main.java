package bank;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        boolean quit = false;
        int choice;
        String accountName;
        double startBalance;
        int accountPin;
        int accountNum;
        int ch;
        while (true)
        {
        	System.out.println("Welcome to BankApp");
            System.out.println("=====================================");
            System.out.println("1)Create Account");
            System.out.println("2)Login Account");
            System.out.println("Enter choice");
            ch = scanner.nextInt();
            switch(ch) {
            	case 1:
            		System.out.print("Enter UserName:");
            		accountName = scanner.next();
            		System.out.print("Enter New Pin");
            		accountPin = scanner.nextInt();
            		if(Login.createAccount(accountName, accountPin))
            		{
            			System.out.print("Account created Successfully!\n");
            		}
            		else {
            			System.out.print("Account Creation Failed");
            		}
            		break;
            	case 2:
            		System.out.print("Enter Name: ");
            		accountName = scanner.next();
            		System.out.print("Enter PIN ");
            		accountPin = scanner.nextInt();
            		if(Login.loginAccount(accountName,accountPin))
            		{
            			System.out.println("Login Successfull!!");
            		}
            		else
            		{
            			System.out.print("Login Failed");
            		}
            		break;
            	
            }
        }
        
    }

}
