/**
 * Write a description of class TestClass here.
 * 
 * @author Gabe Butler
 * @version 8/27/19
 */
public class TestClass
{
    public static void main(String[] args)
    {
        BankAccount a1 = new BankAccount(500, "butler", 123, "pass");
        //a1.deposit = 1000000;
        a1.logIn("butler","pass");
        System.out.println(a1);
        
        //a1.deposit(1000.00);
        //System.out.println(a1);
        
        //a1.withdraw(250.00);
        //System.out.println(a1);
        
    }
}
