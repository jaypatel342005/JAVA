import java.util.Scanner;
public class EorO{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int evenCount=0,oddCount=0;
        System.out.println("Enter a number (0 to stop):");
        int num = scanner.nextInt();
        while (num!=0){
            if (num%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
            System.out.println("Enter a number:");
            num = scanner.nextInt();
        }
        System.out.println("Number of even numbers:"+evenCount);
        System.out.println("Number of odd numbers:"+oddCount);
    }
}