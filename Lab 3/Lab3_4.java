
import java.util.Scanner;
public class Lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number = ");
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("It is a number "+n);
            sc.close();
            return;
        }
        boolean flag = true;
        for(int i = 2; i <= n/2 ; i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        if(flag) System.out.println(n+" is a Prime number");
        else  System.out.println(n+" is not a Prime Number");
        sc.close();
    }
}