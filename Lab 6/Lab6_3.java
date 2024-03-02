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
        Manager mc = new Manager("jay",18 , "000000000", "Antilia", 99999999, "CEO");
        mc.printDetails();
        Employee as = new Employee("rudraraj", 17, "0000000000", "wakaner", 100000, "worker");
        as.printDetails();
    }
}
