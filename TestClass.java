/**
 * Write a description of class TestClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestClass
{
    public static void main(String[] args)
    {
        BankAccount a1 = new BankAccount(500, "butler", 123, "pass");
        a1.logIn("butler", "pass");
        System.out.println(a1);
        
        a1.deposit(9000);
        System.out.println(a1);
        
        a1.withdraw(800);
        System.out.println(a1);

    }
}
