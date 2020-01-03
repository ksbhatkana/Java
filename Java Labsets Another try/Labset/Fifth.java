import java.lang.String;
import java.util.Scanner;



abstract class Player
{
    String name,skill;
    int age,matches;
    abstract void read();
    abstract void display();

}
class Cricket_player extends Player
{
   int runs,wick;
   void read()
   {
        Scanner in =new Scanner(System.in);
        System.out.println("=====Enter Details OF Cricket Player :=====");
        System.out.println("Name : ");
        super.name=in.next();
        System.out.println("Matches : ");
        super.matches=in.nextInt();
        System.out.println("Age : ");
        super.age=in.nextInt();
        System.out.println("Skill : ");
        super.skill=in.next();
        System.out.println("Runs : ");
        runs=in.nextInt();
        System.out.println("Wickets : ");
        wick=in.nextInt();
   
   }
   
   void display()
   {
        System.out.println("=====Cricket player Details=====");
        System.out.println("Name :"+super.name+"\nMatches :"+super.matches+"\nAge :"+super.age+"\nSkills :"+super.skill+"\nRuns :"+runs+"\nWickets :"+wick);
   }

}
class Football_player extends Player
{
    int goals,defend;
    void read()
   {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Details OF Football Player :");
        System.out.println("Name : ");
        super.name=in.next();
        System.out.println("Matches : ");
        super.matches=in.nextInt();
        System.out.println("Age : ");
        super.age=in.nextInt();
        System.out.println("Skill : ");
        super.skill=in.next();
        System.out.println("Goals Scored : ");
        goals=in.nextInt();
        System.out.println("Defend : ");
        defend=in.nextInt();
   
   }
   void display()
   {
        System.out.println("=====Football player Details=====");
        System.out.println("Name :"+super.name+"\nMatches :"+super.matches+"\nAge :"+super.age+"\nSkills :"+super.skill+"\nGoals :"+goals+"\nDefend :"+defend);
   }

}
class Hockey_player extends Player
{
    int goals,defend;
   void read()
   {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Details OF Hockey Player :");
        System.out.println("Name : ");
        super.name=in.next();
        System.out.println("Matches : ");
        super.matches=in.nextInt();
        System.out.println("Age : ");
        super.age=in.nextInt();
        System.out.println("Skill : ");
        super.skill=in.next();
        System.out.println("Goals Scored : ");
        goals=in.nextInt();
        System.out.println("Defend : ");
        defend=in.nextInt();
   
   } void display()
   {
        System.out.println("=====Hockey player Details=====");
        System.out.println("Name :"+super.name+"\nMatches :"+super.matches+"\nAge :"+super.age+"\nSkills :"+super.skill+"\nGoals :"+goals+"\nDefend :"+defend+"\n\n");
   }
}

class Fifth
{
    public static void main(String args[])
    {
        Cricket_player c=new Cricket_player();
        Hockey_player h=new Hockey_player();
        Football_player f=new Football_player();
        c.read();
        h.read();
        f.read();
        System.out.println("\n\n=====Details=====\n\n");
        c.display();
        h.display();
        f.display();
    
    }
}
