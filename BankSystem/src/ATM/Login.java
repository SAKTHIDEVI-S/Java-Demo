package ATM;

import java.util.HashMap;
import java.util.Scanner;
class Login{
	 int accountNumber,accountPin;
	 HashMap<Integer,Integer> users = new HashMap<Integer, Integer>();
     Menu menu = new Menu();
	public void acceptInput()
	{
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the account number: ");
	accountNumber = scanner.nextInt();
	System.out.println("Enter the Password:");
    accountPin = scanner.nextInt();
   
	}

    public void isNewUser() {
    	if(users.containsKey(this.accountNumber))
    	{
    		System.out.println("User Exists");
    		verify();
    		
    	}
    	else
    	{
    		users.put(this.accountNumber, this.accountPin);
    		menu.showMenu();
    	}

    }

    public void verify(){
         
        if(users.get(accountNumber) == this.accountPin)
        {
            System.out.println("Login Successfull!");

            Banking banking = new Banking();
            System.out.println(" ");
            System.out.println("Your Balance is: "+banking.getBalance()+"  Rupees");
            System.out.println(" ");
            menu.showMenu();
        }
        else{
            System.out.println("Incorrect login credentials");
        }
    }


}
