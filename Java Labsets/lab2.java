import java.util.Scanner;
class student
{
	String usn;
	String name;
	String branch;
	int age;
	int sem;
	int m1,m2,m3;
	student()
	{
		System.out.println("this is the DEFAULT constructor");
		System.out.println("HERE ALL THE MEMBERS ARE INITIALISED TO NULL VALUE OR ZERO VALUE");
	}
	student(String u,String n,String b,int a,int s)
	{
		this.usn=u;
		this.name=n;
		this.branch=b;
		this.age=a;
		this.sem=s;
		System.out.println("this is the parameterised constructor");
	}
	student(student x)
	{
		this.usn=x.usn;
		this.name=x.name;
		this.branch=x.branch;
		this.age=x.age;
		this.sem=x.sem;
		System.out.println("this is the copy constructor");
	}
	float avg()
	{
		float ag;
		ag=(m1+m2+m3)/3;
		return ag;
	}
	void print()
	{
		System.out.println("details are"+name+" " +usn+ " "  +branch+ " " +age+ " " +sem);
	}
}
public class lab2
{
	public static void main(String args[])
	{
		String usn;
		String name;
		String branch;
		int age;
		int sem;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name of student");
		name=s.next();
		System.out.println("enter the usn of student");
		usn=s.next();
		System.out.println("enter the branch of student");
		branch=s.next();
		System.out.println("enter the age of student");
		age=s.nextInt();		
		System.out.println("enter the sem of student");
		sem=s.nextInt();
		student st= new student(usn,name,branch,age,sem);
		st.print();
		student st1=new student(st);
		st1.print();
		student st2=new student();
		st2.print();
		st2=st;
		st2.print();
		System.out.println("enter the marks of student in 3 subject");
		st.m1=s.nextInt();
		st.m2=s.nextInt();
		st.m3=s.nextInt();
		float average=st.avg();
		System.out.println("the average marks of student in 3 subject is "+average);
	}
}
	
