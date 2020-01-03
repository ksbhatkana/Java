import java.util.Scanner;

class outer
{
    static int a,c;
    int b;
    
    void read()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Method Called By Object :-");
        System.out.println("Enter Normal Variable Value ");
        b=in.nextInt();
        System.out.println("Enter Static Variable Value ");
        a=in.nextInt();
        
    }
    static void readd()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Method Not Called By Objects :-");
        //System.out.println("Enter Normal Variable Value ");
        //b=in.nextInt();
        /* With Static type function we cannot use normal Variables*/
        System.out.println("Enter Static Variable Value ");
        a=in.nextInt();
    }
    
    static class inner1
    {
    
            void display()
            {
                System.out.println("This is Static Class Normal Function");
            }
            static void displayy()
            {
               System.out.println("This is Static Class Static Function");
            }
    }
    
        class normal
    {
    
            void print()
            {
                System.out.println("This is Normal Class Normal Function");
            }
            /*static void displayy()
            {
               System.out.println("This is Static Class Static Function");
            }*/
            //Inner Class cannot have static declarations
    }



}
public class Third
{
	public static void main(String args[])
	{
		outer n = new outer();
		n.read();
		outer.readd();
		Scanner in = new Scanner(System.in);
        System.out.println("Variables Called in main method :-");
        System.out.println("Enter Normal Variable Value ");
        n.b=in.nextInt();
        System.out.println("Enter Static Variable Value ");
        outer.a=in.nextInt();
        //Static variables can be called by objects but normal variables can't be called just by class name
        
        outer.inner1 ix=new outer.inner1();
        ix.display();
        outer.inner1.displayy();
        
        outer.normal x=n.new normal();
        x.print();
        
	}

}
