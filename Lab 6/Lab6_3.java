import java.util.*;
class Member {
    String name;
    int age;
    String phonenumber;
    String address;
    int salary;
    Member(String name,int age,String phonenumber,String address,int salary){
        this.name = name;
        this.age = age;
        this.phonenumber = phonenumber;
        this.address = address;
        this.salary = salary;
    }
    void printSalary(){
        System.out.println("Salary:"+this.salary);
    }
    void printDetails(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Phone no.:"+this.phonenumber);
        System.out.println("Address:"+this.address);
        printSalary();
    }

}
        

class Employee extends Member{
    String spec;
    Employee(String name,int age,String phonenumber,String address,int salary,String spec){
    super(name, age,phonenumber,address,salary);
    this.spec = spec;
    }
    void printDetails(){
        super.printDetails();
        System.out.println("spec"+this.spec);

    }

}
    class Manager extends Member{
        String department;
        Manager(String name,int age,String phonenumber,String address,int salary,String department ){
            super(name, age,phonenumber,address,salary);
            this.department = department;
        }

            void printDetails(){
                super.printDetails();
                System.out.println("Department"+this.department);
            }
            
           
        }
       
    
public class Lab6_3 {


    public static void main(String[] args) {
    
        Scanner sc= new Scanner (System.in);
        System.out.println("----- enter the data of member -----");
        System.out.println("Enter the name of member:");
        String a=sc.nextLine();
        System.out.println("Enter the age of member:");
        int b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the phone number of member:");
        String c=sc.nextLine();
        System.out.println("Enter the address of member:");
        String d=sc.nextLine();
        System.out.println("Enter the salary of member:");
        sc.nextLine();
        int e=sc.nextInt();
        System.out.println("Enter the department  of member");
        String f=sc.nextLine(); 


        
        System.out.println("----- enter the data of member -----");
        System.out.println("Enter the name of member:");
        String A=sc.nextLine();
        sc.nextLine();
        System.out.println("Enter the age of member:");
        int B=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the phone number of member:");
        String C=sc.nextLine();
        System.out.println("Enter the address of member:");
        String D=sc.nextLine();
        System.out.println("Enter the salary of member:");
        sc.nextLine();
        int E=sc.nextInt();
        System.out.println("Enter the department  of member");
        String F=sc.nextLine(); 



        
    
        Manager mc = new Manager(a,b,c,d,e,f);
        mc.printDetails();
        Employee as = new Employee(A,B,C,D,E,F);
        as.printDetails();
    }
}
