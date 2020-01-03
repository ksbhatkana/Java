import java.util.Scanner;

abstract class trunk_call extends Thread
{
    float charge,duration;
    abstract void duration();
    abstract void charges();
}
class ordinary_call extends trunk_call
{
    void duration()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Receiver Number : ");
        long x = in.nextLong();
        System.out.println("Enter Duration in minutes: ");
        duration=in.nextFloat();
        System.out.println("Call is Being Connected......");        
        try{Thread.sleep(8000);}
        catch(InterruptedException e)
        {System.out.println(e);}    
        System.out.println("Connected......");
        System.out.println("Enter any key disconnect :");
        char s = in.next().charAt(0);
        System.out.println("Disconnected");
        
    }
    void charges()
    {
        charge=duration*2;
        System.out.println("Total Charge : ₹"+charge);
    
    }

}

class urgent_call extends trunk_call
{
    void duration()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Receiver Number : ");
        long x = in.nextLong();
        System.out.println("Enter Duration in minutes: ");
        duration=in.nextFloat();
        System.out.println("Call is Being Connected......"); 
          try{Thread.sleep(3000);}catch(InterruptedException e){System.out.println(e);}       
        System.out.println("Connected......");
        System.out.println("Enter any key disconnect :");
        char s = in.next().charAt(0);
        System.out.println("Disconnected");
        
        
    }
    void charges()
    {
        charge=duration*4;
        System.out.println("Total Charge : ₹"+charge);
    
    }

}

class lightning_call extends trunk_call
{
    void duration()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Receiver Number : ");
        long x = in.nextLong();
        System.out.println("Enter Duration in minutes: ");
        duration=in.nextFloat();
        System.out.println("Call is Being Connected......");        
        try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println(e);}
        System.out.println("Connected......");
        System.out.println("Enter any key disconnect :");
        char s = in.next().charAt(0);
        System.out.println("Disconnected");
        
    }
    void charges()
    {
        charge=duration*6;
        System.out.println("Total Charge : ₹"+charge);
    
    }

}

class sixth
{
    public static void main(String args[])
    {
        boolean b=true;
        System.out.println("------WELCOME TO TRUNK CALL SERVICES------");
        do
        {
        Scanner in = new Scanner(System.in);
        System.out.println("----------------Select a Trunk call facility -----------------");
        System.out.println("1.Ordinary Call (₹ 2/min)\n2.Urgent Call (₹ 4/min)\n3.Lightning Call (₹ 6/min)\n4.Exit");
        System.out.println("Enter your Choice : ");
        int choice = in.nextInt();
        switch(choice)
        {
            case 1:ordinary_call o =new ordinary_call();
                    o.duration();
                    o.charges();
                    break;
            case 2:urgent_call u =new urgent_call();
                    u.duration();
                    u.charges();
                    break;
            case 3:lightning_call l =new lightning_call();
                    l.duration();
                    l.charges();
                    break;
            case 4:b=false;        
        }
        
        }while(b);
    
    
    }


}
