package bank;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	static Scanner scanner = new Scanner(System.in);
	private static final int NULL = 0;
	static Connection con =  connection.getConnection();
	static String sql = "";
	public static boolean createAccount(String accountName, int accountPin) throws SQLException
	{
			if (accountName=="" || accountPin == NULL)
			{
			    System.out.println("All Field Required!");
			    return false;
			}
			Statement st = con.createStatement();
			sql = "INSERT INTO user(accountName, balance, accountPIN) values('" +accountName + "',100," +accountPin + ")";
			
        
        // query
            
        if (st.executeUpdate(sql)==1)
        {
        	System.out.println(accountName+ ", Now you Login!");
        	return true;
        }
        return false;
	}
        public static boolean loginAccount(String accountName, int accountPin) throws SQLException // login method
        {
                // validation
                if (accountName == "" || accountPin == NULL) {
                    System.out.println("All Field Required!");
                    return false;
                }
                // query
                sql = "select * from user where accountName='"
                      + accountName + "' and accountPin=" + accountPin;
                PreparedStatement st = con.prepareStatement(sql);
        ResultSet rs = st.executeQuery();
        // Execution
        BufferedReader sc = new BufferedReader(
            new InputStreamReader(System.in));

        if (rs.next()) {
        	printMainMenu();
            double balance =100;
			// after login menu driven interface method
        	Account account = new Account(balance);
            printMainMenu();
            boolean quit=false;
			while(!quit)
            {
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.printf("Account Name: %s\nAccount Balance: $%.2f\n",account.getAccountName(),
                    account.getAccountBal());
                    break;
                case 2:
                    System.out.println("Enter amount to be added: ");
                    account.addFunds(scanner.nextDouble());
                    break;
                case 3:
                    System.out.println("Enter amount to be transferred: ");
                    account.transferFunds(scanner.nextDouble());
                    break;
                case 4:
                	System.out.println("Enter amount to be paid using swipe card: ");
                	account.swipeCardTransfer(scanner.nextDouble());
                case 5:
                	printMainMenu();
                	break;
                case 6:
                    quit = false;
                    break;
                
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
            }
        scanner.close();
        }
        else {
            return false;
        }
        // return
        return true;
	
}

public static void printMainMenu(){
    System.out.printf("%24s\n" +
            "=====================================\n" +
            "Please select an option:\n" +
            "1 - Check Balance\n" +
            "2 - Add Funds\n" +
            "3 - Transfer Funds\n" +
            "4 - Print the main menu\n"+
            "5 - Exit the program\n" +
            "=====================================\n" +
            "Choice: ","BankApp v1.0");
}
}
