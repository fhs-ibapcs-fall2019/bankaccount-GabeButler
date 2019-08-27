public class BankAccount
{
    private double balance;
    private String accountHolder;
    private int accountNumber;
    private String password;
    private boolean loggedIn;
    private double deposit;
    
    public BankAccount(double balance, String accountHolder, int accountNumber,
    String password)
    {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.password = password;
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
    
    public void deposit(double ammount)
    {
        if (loggedIn)
        {
            if (ammount > 0)
                balance = balance + ammount;
            else
                throw new IllegalStateException("You need to deposit a positive amount of money.");
        }
        else
        {
            throw new IllegalStateException("You are not logged in.");
        }
    }
        
    public void withdraw(double ammount)
    {
        if (loggedIn)
        {
            if (balance >= ammount)
                balance = balance - ammount;
            else
                throw new IllegalStateException("You don't have that much money in your account.");
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

