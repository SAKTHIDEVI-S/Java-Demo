package bankatm;

import java.util.Scanner;

public class AccountDriver {
	// Entry point of program
    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);
        
        // Create array of Accounts
        Account account [] = new Account[100];
        int numAccounts = 0; 

        int choice;

        do {
            choice = menu(scanner);
            System.out.println();
            
            if(choice == 1) {
                account[numAccounts++] = createAccount(scanner);
            } else if(choice == 2) {
                doDeposit(account, numAccounts, scanner);
            } else if(choice == 3) {
                doWithdraw(account, numAccounts, scanner);
            } else if(choice == 4) {
                applyInterest(account, numAccounts, scanner);
            } else if(choice==5)
            {
            	printBalance(account, numAccounts, scanner);
            } else if(choice==6)
            {
            	doSwipeTransaction(account, numAccounts, scanner);
            }
            else {
                System.out.println("GoodBye!");
            }
            System.out.println();
        } while(choice != 7);
    }

    /**
     * Account choice
     * 
     * @param scanner 
     * @return choice
     */
    public static int accountMenu(Scanner scanner) {
        System.out.println("Select Account Type");
        System.out.println("1. Checking Account");
        System.out.println("2. Savings Account");

        int choice;
        do {
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
        }while(choice < 1 || choice > 2);
        
        return choice;
    } 

    public static int searchAccount(Account accounts [], int count, int accountNumber) {

        for(int i=0; i<count; i++) {
            if(accounts[i].getAccountNumber() == accountNumber) {
                return i;
            }
        }

        return -1; 
    }

    /**
     * Function to perform Deposit on a selected account
     */
    public static void printBalance(Account accounts[], int count, Scanner scanner)
    {
    	System.out.print("\nPlease enter account number: ");
    	int accountNumber = scanner.nextInt();
    	int index = searchAccount(accounts, count, accountNumber);
    	if(index >= 0) {
    		System.out.println("Current Balance is: " +accounts[index].getBalance());
    		
    		
    	}
    	else
    	{
    		System.out.println("No account exist with AccountNumber: " + accountNumber);
    	}
    	
    	
    }
    public static void doSwipeTransaction(Account accounts[], int count, Scanner scanner)
    {
    	System.out.print("\nPlease enter account number: ");
    	int accountNumber = scanner.nextInt();
    	int index = searchAccount(accounts, count, accountNumber);
    	if(index >= 0) {
    		System.out.println("Please enter purchase amount: ");
    		double amount = scanner.nextDouble();
    		accounts[index].swipeCardTransfer(amount);
    	}
    	else
    	{
    		System.out.println("No account exist with AccountNumber: " + accountNumber);
    	}
    	
    	
    }
    public static void doDeposit(Account accounts [], int count, Scanner scanner) {
        // Get the account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = scanner.nextInt();

        // search for account
        int index = searchAccount(accounts, count, accountNumber);

        if(index >= 0) {
            // Amount
            System.out.print("Please enter Deposit Amount: ");
            double amount = scanner.nextDouble();

            accounts[index].deposit(amount);
        } else {
            System.out.println("No account exist with AccountNumber: " + accountNumber);
        }
    }

    public static void doWithdraw(Account accounts [], int count, Scanner scanner) {
        // Get the account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = scanner.nextInt();

        // search for account
        int index = searchAccount(accounts, count, accountNumber);

        if(index >= 0) {
            // Amount
            System.out.print("Please enter Withdraw Amount: ");
            double amount = scanner.nextDouble();
            accounts[index].withdraw(amount);
        } else {
            System.out.println("No account exist with AccountNumber: " + accountNumber);
        }
    }

    public static void applyInterest(Account accounts [], int count, Scanner scanner) {
        // Get the account number
        System.out.print("\nPlease enter account number: ");
        int accountNumber = scanner.nextInt();

        // search for account
        int index = searchAccount(accounts, count, accountNumber);

        if(index >= 0) {
            
            // must be instance of savings account
            if(accounts[index] instanceof SavingsAccount) {
                ((SavingsAccount)accounts[index]).applyInterest();
            }
        } else {
            System.out.println("No account exist with AccountNumber: " + accountNumber);
        }
    }

    /**
     * Function to create a new Account
     */
    public static Account createAccount(Scanner scanner) {

        Account account = null; 
        int choice = accountMenu(scanner);

        int accountNumber;
        System.out.print("Enter Account Number: ");
        accountNumber = scanner.nextInt();

        if(choice == 1)  { // checking account
            account = new CheckingAccount(accountNumber);
        } else { // Savings account
            
            System.out.print("Please enter Interest Rate: ");
            double ir = scanner.nextDouble();
            account = new SavingsAccount(accountNumber, ir);
        }
        return account;
    }

    /**
     * Menu to display options and get the user's selection
     * 
     * @param scanner
     * @return choice
     */
    public static int menu(Scanner scanner) {
        System.out.println("Bank Account Menu");
        System.out.println("1. Create New Account");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Apply Interest");
        System.out.println("5. Check Balance");
        System.out.println("6. Purchase Using Swipe Card");
        System.out.println("7. Quit");

        int choice;

        do {
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
        } while(choice < 1 || choice > 7);

        return choice;
    }    
}
