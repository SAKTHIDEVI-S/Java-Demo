package bank;

public class Account {
    private String accountName;
    private double accountBal;

    public Account(double accountBal) {
        if(accountBal < 100) {
            System.out.println("Starting balance cannot be less than 100 USD\n");
            quit();
        }else {
            this.accountName = accountName;
            this.accountBal = accountBal;
            System.out.println("Account initialized.\nBalance set to $\n" + this.accountBal);
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAccountBal() {
        return accountBal;
    }

    public void transferFunds(double withdrawal){
    	if(withdrawal%5!=0)
    	{
    		System.out.printf("Please correct the amount of value. It should be multiple of USD");
    	}
    		else if(withdrawal < 0){
            System.out.println("Transfer amount must be greater than zero. Transfer failed.");
        }else if(withdrawal>100)
        {
        	System.out.printf("Withdraw $%.2f\n", withdrawal);
        	double charges = 0.04*withdrawal;
        	System.out.printf("Charges $%.2f\n", charges);
        	if(withdrawal+charges<this.accountBal)
        	{
        		this.accountBal -= (withdrawal+charges);
        		System.out.printf("Transfer of $%.2f successful. Your new balance is $%.2f.\n",withdrawal,this.accountBal);
        	}
        	else
        	{
        		System.out.printf("Unable to transfer $%.2f. Balance is insufficient.\n",withdrawal);
        	}
        }
        else{
        	System.out.printf("Withdraw $%.2f\n", withdrawal);
        	double charges = 0.02*withdrawal;
        	System.out.printf("Charges $%.2f\n", charges);
        	if(withdrawal+charges<this.accountBal)
        	{
        		this.accountBal -= (withdrawal+charges);
        		System.out.printf("Transfer of $%.2f successful. Your new balance is $%.2f.\n",withdrawal,this.accountBal);
        	}
        	else
        	{
        		System.out.printf("Unable to transfer $%.2f. Balance is insufficient.\n",withdrawal);
        	}
        }
    }

    public void addFunds(double deposit){
        if(deposit < 0){
            System.out.println("Amount deposited must be greater than zero.\n");
        }else {
            this.accountBal += deposit;
            System.out.printf("Deposit of $%.2f successful. Your new balance is $%.2f.\n",deposit,this.accountBal);
        }
    }
    public void swipeCardTransfer(double shoppingAmount) {
    	if(shoppingAmount>this.accountBal) {
    		System.out.printf("Unable to pay $%.2f. Balance is insufficient\n",shoppingAmount);
    	}
    	else
    		System.out.printf("Shopping Amount $%.2f\n",shoppingAmount);
    		double cashBack = 0.01*shoppingAmount;
    		System.out.printf("CashBack $%.2f\n", cashBack);
    		this.accountBal -= (shoppingAmount-cashBack);
    		System.out.printf("Transfer of $%.2f successful. Your new balance is $%.2f.\n",shoppingAmount,this.accountBal);
    		
    }
    public void quit()
    {
    	System.out.println("Transaction ended");
    }	
	
}