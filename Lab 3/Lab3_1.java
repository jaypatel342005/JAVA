import java.util.*;
public class Lab3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks of Subject 1 = ");
        int a=sc.nextInt();
        System.out.print("Enter Marks of Subject 2 = ");
        int b=sc.nextInt();
        System.out.print("Enter Marks of Subject 3 = ");
        int c=sc.nextInt();
        System.out.print("Enter Marks of Subject 4 = ");
        int d=sc.nextInt();
        System.out.print("Enter Marks of Subject 5 = ");
        int e=sc.nextInt();
        System.out.println  ("Percentage = "+((double)a+b+c+d+e)/5);
        double per=(a+b+c+d+e)/5;
        if(per>=60)
        {
            System.out.println("First Division");
        }
        else if(per>=50 && per<=59)
        {
            System.out.println("Second Division");
        }
        else if(per>=40 && per<=49)
        {
            System.out.println("Third Division");
        }
        else if(per<=40)
        {
            System.out.println("Fourth Division");
        }
    }
}
