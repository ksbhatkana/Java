import java.util.Scanner;

interface Stk
{
    void push();
    void pop();

}

class stack implements Stk
{
    int data;
    public void push()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Data To Be Pushed :");
        data = in.nextInt();
    }
    public void pop()
    {
        System.out.println("Element Poped is " +data);
    }
}

class eighth
{

    public static void main(String args[])
    {
        int size;
        int top=-1;
        boolean x=true;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Size of the Stack :");   
        size=in.nextInt();
        stack s[] = new stack[size];
        do
        {
            System.out.println("\n1.PUSH\n2.POP\n3.Display\n4.Exit\n");
            System.out.println("Enter Your Choice : ");
            int choice = in.nextInt();
            switch(choice)
            {
                case 1:if(top+1==size)
                        {
                            System.out.println("STACK IS FULL :  \n");
                            System.out.println("Creating Place for Your Data  :  \n");
                            size=size*2;
                            stack n[]=new stack[size];
                            for(int i=0;i<size;i++)
                            {
                                n[i]=s[i];
                            }
                            s=n;
                            
                        }
                        top++;
                        s[top]= new stack();
                        s[top].push();
                       break;
                case 2:if(top==-1)
                            {System.out.println("STACK IS EMPTY :  \n");
                                break;}
                        s[top].pop();
                        top--;
                        break;
                case 3: for(int i =0 ;i<=top;i++)
                        {
                            System.out.print(s[i].data + "\t");
                        }
                        break;
                case 4:x=false;
            
            }
        
        }while(x);
    }

}
