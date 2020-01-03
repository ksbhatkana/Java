import java.util.Scanner;
class employeeDetail
{
       int emp_id;
       String emp_name;
       String designation;
       int age;
       double salary;
       void empDetails()
       {
          System.out.println("enter the employee detail");
          Scanner s=new  Scanner (System.in);
          System.out.println("enter id,name,designatin,age");
          emp_id=s.nextInt();
          emp_name=s.next();
          designation=s.next();
          age=s.nextInt();
        }
        void display()
        {
             // System.out.println("the details of employee are ");
              System.out.println("name: "+emp_name+"\nID:"+emp_id+"\ndesigation:"+designation+"\nage:"+age+"\nsalary:"+salary);
         }
         public class employeeSalary
         {
         double basic_sal;
         int da;
         int hra;
         void salDetails()
         {
            System.out.println("enter the employee salary detail ie basicsalary,da,hra");
            Scanner sc=new  Scanner (System.in);
            basic_sal=sc.nextDouble();
            da=sc.nextInt();
            hra=sc.nextInt();
         }
         void salaryCalc()
        {
            //employeeSalary i=new employeeSalary();
            salary=basic_sal+da+hra;
            System.out.println("salary="+salary);
        }
         }//end of inner class
}//end of outer class
 public class lab4a
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        employeeDetail e1=new employeeDetail();
        employeeDetail.employeeSalary e2=e1.new employeeSalary();
          e1.empDetails();
          e2.salDetails();
          e2.salaryCalc();
          e1.display();
     }
 }

		
