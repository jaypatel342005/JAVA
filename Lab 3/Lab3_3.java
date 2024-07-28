import java.util.Scanner;
public class Lab3_3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number a = ");
            int a = sc.nextInt();
            System.out.print("Enter Number b = ");
            int b = sc.nextInt();
            System.out.print("Enter Number c = ");
            int c = sc.nextInt();

            if(a > b){
                if(a > c){
                    System.out.println("Number a = "+a+" is Largest");
                }
                else {
                    System.out.println("Number c = "+c+" is Largest");
                }
            }
            else{
                if(b > c){
                    System.out.println("Number b = "+b+" is Largest");
                }
                else {
                    System.out.println("Number c = "+c+" is Largest");
                }
            }
            sc.close();
            
        }
}