 import java.util.Scanner;
 class call
  {
    String type;
    double charges,amt;
    Scanner in = new Scanner(System.in);
    public void charges(float i)
    {
            amt=2.0;
            charges=amt*i;
            System.out.println("Total charges for an Ordinary CALLis:"+charges);
    }
     public void charges(int i)
     {
            amt=3.0;
            charges=amt*i;
            System.out.println("Total charges for an Urgent CALLis:"+charges);
    }
    public void charges(double i)
    {
            amt=4.0;
            charges=amt*i;
            System.out.println("Total charges for an Lightning CALLis:"+charges);
    }
}
 class lab6
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       call n= new call();
       String s;
       float d;
       int e;
       double f;
       System.out.println("Enter the type of call");
       s=sc.nextLine();
       if(s.equalsIgnoreCase("Ordinary")==true)
       {
           System.out.println("For Ordinary Call");
           System.out.println("Enter Call Duration");
           d=sc.nextFloat();
           n.charges(d);
       }
       else if(s.equalsIgnoreCase("Urgent")==true)
       {
           System.out.println("For Urgent Call");
           System.out.println("Enter Call Duration");
           e=sc.nextInt();
           n.charges(e);
       }
       else if(s.equalsIgnoreCase("Lightning")==true)
       {
           System.out.println("For Lightning Call");
           System.out.println("Enter Call Duration");
           f=sc.nextDouble();
           n.charges(f);
       }
       else
       {
       	System.out.println("not a right type of the call");
       }
    }
}






