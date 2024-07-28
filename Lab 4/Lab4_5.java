/**
 * Lab4_5
 */
import java.util.Scanner;
public class Lab4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:" );
        String str = sc.nextLine();
        int length = str.length();
        String s = "";
        for(int i = length / 2 ; i < length ; i++){
            s += str.charAt(i);
        }
        System.out.println("Second Half of String : "+s);
        sc.close();
        
    }
    
}