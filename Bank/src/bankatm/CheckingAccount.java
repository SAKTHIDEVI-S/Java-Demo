package bankatm;


public class CheckingAccount extends Account {

    // default constructor
    public CheckingAccount() {
        super();
    }

    /**
     * Parameter constructor to intialize CheckingAccount
     * with a Account Number
     *  
     */
    public CheckingAccount(int accountNumber) {
        super(accountNumber);
    }

    /**
     * Function to deposit funds into the account
     * 
     * 
     * @param amount value to be deposited
     */
    public void deposit(double amount) {

        // First Check amount
      
            if(amount < 0){
                System.out.println("Amount deposited must be greater than zero.\n");
            }else {
                balance += amount;
                System.out.printf("Deposit of $%.2f successful. Your new balance is $%.2f.\n",amount,balance);
            }
        }
    public void swipeCardTransfer(double shoppingAmount) {
        	if(shoppingAmount>balance) {
        		System.out.printf("Unable to pay $%.2f. Balance is insufficient\n",shoppingAmount);
        	}
        	else
        		System.out.printf("Shopping Amount $%.2f\n",shoppingAmount);
        		double cashBack = 0.01*shoppingAmount;
        		System.out.printf("CashBack $%.2f\n", cashBack);
        		balance -= (shoppingAmount-cashBack);
        		System.out.printf("Transfer of $%.2f successful. Your new balance is $%.2f.\n",shoppingAmount,balance);
        		
        }

    /**
     * Function to withdraw funds from the Account
     * 
     * @param amount value to be withdrawn
     */
    public void withdraw(double amount) {
    	if(amount%5!=0)
    	{
    		System.out.printf("Please correct the amount of value. It should be multiple of USD");
    	}
    		else if(amount < 0){
            System.out.println("Transfer amount must be greater than zero. Transfer failed.");
        }else if(amount>100)
        {
        	System.out.printf("Withdraw $%.2f\n", amount);
        	double charges = 0.04*amount;
        	System.out.printf("Charges $%.2f\n", charges);
        	if(amount+charges<balance)
        	{
        		balance -= (amount+charges);
        		System.out.printf("Transfer of $%.2f successful. Your new balance is $%.2f.\n",amount,balance);
        	}
        	else
        	{
        		System.out.printf("Unable to transfer $%.2f. Balance is insufficient.\n",amount);
        	}
        }
        else{
        	System.out.printf("Withdraw $%.2f\n", amount);
        	double charges = 0.02*amount;
        	System.out.printf("Charges $%.2f\n", charges);
        	if(amount+charges<balance)
        	{
        		balance -= (amount+charges);
        		System.out.printf("Transfer of $%.2f successful. Your new balance is $%.2f.\n",amount,balance);
        	}
        	else
        	{
        		System.out.printf("Unable to transfer $%.2f. Balance is insufficient.\n",amount);
        	}
        }

    }
}

