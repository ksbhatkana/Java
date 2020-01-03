import java.util.Scanner;
import java.lang.String;
import Balance.Account;

class Bank
{
    String id,name;
    void read()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Details of employee :");
        System.out.println("ID :");
        id=in.next();
        System.out.println("Name :");
        name=in.next();
     }
}

public class seventh
{
    public static void main(String args[])
    {
        String id,name;
        Scanner in = new Scanner(System.in);
        Bank ba=new Bank();
        Account a = new Account();
        ba.read();
        System.out.println("Bank Balance :");
        a.b=in.nextInt();
        a.Display();
    
    }

}
