 import java.util.Scanner;
 class exep extends Exception
{
    exep( String m)
    {
        super(m);
    }

}
class lab9
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        /*System.out.println("ASSUME that there is a bypass exactly at the middle of the 100m road and the to vechiles are at opposite ends             equidistant from the bypass\n\n");*/
        System.out.println("Enter the  direction of the vechiles \n");
        String s0,s1;
        try
        {
                s0=s.next();s1=s.next();
            if(s0.equals(s1))
                System.out.println("The vechiles will  not collide\n");
            else
                throw new exep("The vechiles will collide");
        }
        catch(Exception e)
        {
            System.out.println("Exception"+e);
        }

    }
}

