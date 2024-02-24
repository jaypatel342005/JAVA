import java.util.Scanner;
public class Lab4_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Array: ");
        int[] ro = new int[5];
        for(int i=0;i<ro.length;i++){
            ro[i]= sc.nextInt();
            System.out.print(ro[i]); 
        }
        System.out.println();
        for(int i=4;i>=0;i--){
            System.out.print(+ro[i]);
        }
    }
}
