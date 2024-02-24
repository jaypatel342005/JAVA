import java.util.*;
public class Lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. 1 = ");
        double a = sc.nextDouble();
        System.out.print("Enter No. 2 = ");
        double b = sc.nextDouble();
        System.out.print
        ("Enter operator = ");
        String s = sc.next();
        if(s.equals("+"))
        {
            System.out.println("Addition is "+(a+b));
        }
        else if (s.equals("-")) 
        {
            System.out.println("Substraction is "+(a-b));    
        }
        else if (s.equals("*")) 
        {
            System.out.println("Multiplication is "+(a*b));    
        }
        else if (s.equals("/")) 
        {
            System.out.println("Division is "+(a/b));    
        }   
    }
    
}
