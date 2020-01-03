  import java.util.Scanner;
interface instack
{
    void push(int item);
    int pop();
}
class dstack implements instack
{
    private int stk[];
    private int top;
    dstack(int size)
    {
        stk=new int[size];
        top=-1;
    }
    public void push(int item)
    {
        if(top==stk.length-1)
        {
            System.out.println("Exceeds the initial size so size is expanded and inserted");
            int temp[]=new int[stk.length*2];
            for(int i=0;i<stk.length;i++)
                temp[i]=stk[i];
            stk=temp;
            stk[++top]=item;
        }
        else
            stk[++top]=item;
    }
    public int pop()
    {
        if(top<0)
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
             return stk[top--];
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("STACK IS EMPTY\n");
        }
        else
        {
            for(int i=0;i<=top;i++)
            {
                System.out.println(stk[i]);
            }
        }
    }
}
class lab8
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the size of the stack\n");
        int size=s.nextInt();
        dstack stack=new dstack(size);
        while(true)
        {
                System.out.println("\n\n1.push\n2.pop\n3.display\n");
                System.out.println("Enter ur choice\n");

                int choice=s.nextInt();



                    switch(choice)
                    {
                        case 1:System.out.println("Enter the elements of the stack\n");
                              for(int i=0;i<size;i++)
                              {
                                  int a=s.nextInt();
                                  stack.push(a);
                              }
                              break;
                        case 2:int p=stack.pop();
                            System.out.print("The popped element is  "+p);
                                break;
                        case 3:System.out.print("\t Elements in stack -> \n");
                            stack.display();
                            break;
                    }
        }

    }
}

