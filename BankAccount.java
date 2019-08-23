public class BankAccount
{
    private double balance;
    private String accountHolder;
    private int accountNumber;
    private String password;
    private boolean loggedIn;
    private double deposit;
    
    public BankAccount(double balance, String accountHolder, int accountNumber,
    String password, double deposit)
    {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.password = password;
        this.deposit = deposit;
        this.loggedIn = false;
    }
    
    //mutator - allow you to change an instance variable (attribute)
    public void logIn(String name, String password)
    {
        if (accountHolder.equals(name) && this.password.equals(password))
        {
            loggedIn = true;
        }
    }
    
    //accessor - gives access to the balance instance variable (attribute)
    public double getBalance()
    {
        if (loggedIn)
        {
           return balance;  
        }
        else
        {
           throw new IllegalStateException("You are not logged in.");
        }
    }  
    
    public double deposit()
    {
        if (loggedIn)
        {
            double balance = this.balance + deposit;
        }
        else
        {
            throw new IllegalStateException("You are not logged in.");
        }
    }
        

       
    //mutator - logs user out
    public void logOut()
    {
       loggedIn = false; 
    }

}

