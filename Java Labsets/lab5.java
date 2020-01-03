import java.util.Scanner;
abstract class plyr
{
    String name;
    int age;
    abstract void info();
    abstract void display();
    
}
class cricplyr extends plyr
{
    Scanner s=new Scanner(System.in);
    int pid;
    void info()
    {
    	System.out.println("enter name age and pid of cricket player");
    	name=s.next();
    	age=s.nextInt();
    	pid=s.nextInt();
    }
    void display()
    {
    	System.out.println("cricket player");     
    	System.out.println("NAME\tAGE\tPLAYER_ID\n"+name+"\t"+age+"\t"+pid);       
    }
   
}
class ftblplyr extends plyr
{
    Scanner s=new Scanner(System.in);
    int pid;
    void info()
    {
    	System.out.println("enter name age and pid of football player");
    	name=s.next();
    	age=s.nextInt();
    	pid=s.nextInt();    
    }
    void display()
    {
    	System.out.println("football player");
    	System.out.println("NAME\tAGE\tPLAYER_ID\n"+name+"\t"+age+"\t"+pid);       
    }
   
}
class hkyplyr extends plyr
{
    Scanner s=new Scanner(System.in);
    int pid;
    void info()
    {
    	System.out.println("enter name age and pid of hockey player");
    	name=s.next();
    	age=s.nextInt();
    	pid=s.nextInt();      
    }
   void display()
    {
    	System.out.println("hockey player");
    	System.out.println("NAME\tAGE\tPLAYER_ID\n"+name+"\t"+age+"\t"+pid);       
    }
}
class lab5
{
    public static void main(String []args)
    {
        cricplyr p1=new cricplyr();
        hkyplyr p2=new hkyplyr();
        ftblplyr p3=new ftblplyr();
        p1.info();
        p2.info();
        p3.info();
        p1.display();
        p2.display();
        p3.display();
    }
}

