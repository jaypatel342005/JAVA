import java.util.Scanner;
public class Lab3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number = ");
        int n = sc.nextInt();
        int a = n, r = 0 , pal = 0;
        while(a > 0){
             r = a % 10;
            pal = pal*10 + r;
            a /= 10;
        }
        if(pal == n) System.out.println(n+" is a Palindrome Number");
        else System.out.println(n+" is not a Palindrome Number");


        
        // System.out.print("Enter String = ");
        // String s = sc.nextLine();
        // boolean flag = true;
        // for(int i = 0 ; i <= s.length() / 2 ; i++) {
        //     if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        //         flag  = false;
        //         break;
        //     }
        // }
        // if(flag) System.out.println(s+ " is a Palindrome");
        // else System.out.print(s+ " is not a Palindrome");
        
        sc.close();
    }
}