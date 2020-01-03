import java.util.Scanner;

class MyException
{
    MyException()
    {
    
    }

}
class road extends Exception
{
   Scanner in = new Scanner(System.in);
   boolean x=true;
   int c1,c2;
   void collision()
   {
         System.out.println("ROAD ACCIDENT MANAGEMENT");
        do
        {
            System.out.println("Select Road Direction :-");
          
            System.out.println("1.North-South\n2.East-West\n3.Exit");
            int choice =in.nextInt();
            switch(choice)
            {
                case 1:System.out.println("CAR 1 MOVES :-\n1.North-South\n2.South-North\n");
                        c1=in.nextInt();
                        System.out.println("CAR 2 MOVES :-\n1.North-South\n2.South-North\n");
                        c2=in.nextInt();
                        if(c1==c2)
                        {
                            System.out.println("NOO PROBLEM.....");
                            break;
                        }
                        else
                        {
                            try
                            {
                                throws new MyException();
                            }
                        
                        }
                        break;
                case 2:System.out.println("CAR 1 MOVES :-\n1.East-West\n2.West-East\n");
                       c1=in.nextInt();
                        System.out.println("CAR 2 MOVES :-\n1.East-West\n2.West-East\n");
                        c2=in.nextInt();
                        if(c1==c2)
                        {
                            System.out.println("NOO PROBLEM.....");
                            break;
                        }
                        break;
                 case 3:x=false;
            
            }
        }while(x);
   
   } 

}

class ninth 
{
    public static void main(String args[])
    {
        road r = new road();
        r.collision();
    }
}
