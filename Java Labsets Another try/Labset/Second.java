import java.util.Scanner;
import java.lang.String;

class Student
{
	String usn,name,branch;
	int age,sem;
	float m1,m2,m3,avg;
	Student()
	{
		System.out.println("======================Non-parameterise Constructor =======================\n");
		usn="1si17is017";
		name="Rishav";
		branch="ISE";
		age=20;
		sem=5;
		m1=80;
		m2=88;
		m3=96;
		avg=(m1+m2+m3)/3;	
	
	}
	Student(String u,String n,String b,int a,int s,float m1,float m2,float m3)
	{
		System.out.println("=======================Parameterise Constructor ======================\n");
		usn=u;
		name=n;
		branch=b;
		age=a;
		sem=s;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		avg=(m1+m2+m3)/3; 		
	}
	Student(Student s2)
	{	
		System.out.println("========================Copy Constructor==================== \n");
		this.usn=s2.usn;
		this.name=s2.name;
		this.age=s2.age;
		this.branch=s2.branch;
		this.sem=s2.sem;
		this.m1=s2.m1;
		this.m2=s2.m2;
		this.m3=s2.m3;
		this.avg=s2.avg;
	}
	void Display()
	{
	System.out.println("USN : "+usn+"\nName : "+name+"\nAge :"+age+"\nBranch :"+branch+"\nSemester :"+sem);
	System.out.println("Marks 1 :"+m1+"\nMarks 2 :"+m2+"\nMarks 3 :"+m3);
	System.out.println("Average : "+avg);
	}

}

class Second
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String usn,name,branch;
		int age,sem;
		float m1,m2,m3;
		System.out.println("\nEnter Parameters for constructors");
		System.out.print("USN : ");
		usn=in.next();
		System.out.print("Name : ");
		name=in.next();
		System.out.print("Branch : ");
		branch=in.next();
		System.out.print("Age : ");
		age=in.nextInt();
		System.out.print("Semester : ");
		sem=in.nextInt();
		if(sem>8 || sem<0)
		{
			System.out.println("Incorrect Semester :");
			System.out.println("Enter Semester : ");
			sem=in.nextInt();		
		}
		System.out.println("Enter Three Subjects Marks");
		m1=in.nextFloat();
		m2=in.nextFloat();
		m3=in.nextFloat();

		Student s1=new Student();
		s1.Display();

		Student s2=new Student(usn,name,branch,age,sem,m1,m2,m3);
		s2.Display();

		Student s3=new Student(s2);
		s3.Display();
		
		
	}

}
