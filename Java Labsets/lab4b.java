 import java.util.Scanner;
class Employee
{
  String empname;
  String empdesgn;
  int empid;
  int age;
  static double salary;
  void empdetails()
  {
    System.out.println("enter the employee details");
    Scanner s=new Scanner(System.in);
    System.out.println("enter name,designation,id,age ");
    empname=s.next();
    empdesgn=s.next();
    empid=s.nextInt();
    age=s.nextInt();

  }
   void display()
  {
    System.out.println("employee Details:");
    System.out.println("\nname: "+empname + "\ndesignation: "+
empdesgn+"\nempid: "+empid+"\nage: "+age+"\nsalary: "+salary);
  }
  static class EmpSalary
  {
     double basic;
     int hra,da;
     void Saldetails()
     {
       System.out.println("enter the salary details");
       Scanner s1=new Scanner(System.in);
       System.out.println("enter basic,hra and da salary");
       basic=s1.nextDouble();
       hra=s1.nextInt();
       da=s1.nextInt();
      }
     void calcsal()
     {
       salary=basic+hra+da;
       System.out.println("salary: "+salary);
      }
  }
}
public class lab4b
{
  public static void main(String[]args)
  {
    Scanner sc=new Scanner(System.in);
    //System.out.println("enter the number of employees");
    //int n=sc.nextInt();
    Employee e1=new Employee();
    Employee.EmpSalary e2=new Employee.EmpSalary();
    e1.empdetails();
    e2.Saldetails();
    e2.calcsal();
    e1.display();
  }
}

