import java.lang.String;
import java.util.Scanner;


class employeeDetail
{
    static String emp_id,emp_name,designation;
    static int age,salary;
    static class semployeeSalary
    {
        static int basic_sal,da,hra;
        
        void inread()
        {
           
                Scanner in = new Scanner(System.in);
                System.out.println("Enter Details of Employee :");
                System.out.println("Employee ID :");
                emp_id=in.next();
                System.out.println("Employee Name :");
                emp_name=in.next();
                System.out.println("Employee Designation :");
                designation=in.next();
                System.out.println("Employee Age :");
                age=in.nextInt();
                System.out.println("Employee Basic Salary :");
                basic_sal=in.nextInt();
                System.out.println("Employee DA :");
                da=in.nextInt();
                System.out.println("Employee HRA :");
                hra=in.nextInt();
                salary=basic_sal+da+hra;
        }
        void display()
        {
            System.out.println("ID :"+emp_id+"\nNAME:"+emp_name+"\nDesignation :"+designation+"\nAge :"+age+"\nSalary :"+salary+"\nBasic Salary :"+basic_sal+"\nDA :"+da+"\nHRA :"+hra);
        
        }
    
    }
    class nemployeeSalary
    {
        int basic_sal,da,hra;
        
        void inread()
        {
           
                Scanner in = new Scanner(System.in);
                System.out.println("Enter Details of Employee :");
                System.out.println("Employee ID :");
                emp_id=in.next();
                System.out.println("Employee Name :");
                emp_name=in.next();
                System.out.println("Employee Designation :");
                designation=in.next();
                System.out.println("Employee Age :");
                age=in.nextInt();
                System.out.println("Employee Basic Salary :");
                basic_sal=in.nextInt();
                System.out.println("Employee DA :");
                da=in.nextInt();
                System.out.println("Employee HRA :");
                hra=in.nextInt();
                salary=basic_sal+da+hra;
        }
        void display()
        {
            System.out.println("ID :"+emp_id+"\nNAME:"+emp_name+"\nDesignation :"+designation+"\nAge :"+age+"\nSalary :"+salary+"\nBasic Salary :"+basic_sal+"\nDA :"+da+"\nHRA :"+hra);
        
        }
    
    }


}

class Forth
{

    public static void main(String args[])
    {
        employeeDetail.semployeeSalary obj = new employeeDetail.semployeeSalary();
        System.out.println("\n\n======Static Class Example :======\n\n");
        obj.inread();
        System.out.println("\n\n======Display ======\n\n");
        System.out.println("\n\n======Static class ======\n\n");
        obj.display();
        employeeDetail n = new employeeDetail();
        employeeDetail.nemployeeSalary obj2 = n.new nemployeeSalary();
        System.out.println("\n\n======Normal Class Example :======\n\n");
        obj2.inread();
        System.out.println("\n\n======Display ======\n\n");
        System.out.println("\n\n======Normal Class ======\n\n");
        obj2.display();    
    }
}
