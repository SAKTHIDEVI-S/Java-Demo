package ATM;

class Banking{
    int balance = 1000;
    public void initiate()
    {
        Login login = new Login();
            login.acceptInput();
            login.isNewUser();
            

    }

    public int getBalance(){
        return amount;
    }

    public void add(int amt){
        balance = balance + amt;
        System.out.println("Amount deposited Successfully");
        System.out.println(" ");
        System.out.println("Total Balance: " +balance);
        System.out.println(" ");
    }

    public void withdraw(int amt){
        System.out.println(" ");

        if(balance < amt)
        {
            System.out.println("Withdrawal amount is less than balance amount");
        }
        else{
            amount = (amount - amt);
            System.out.println("Please Collect your " + amt +" Rupees");
            System.out.println(" ");
            System.out.println("Total Balance: " +amount);
            System.out.println(" ");
        }
    }
}