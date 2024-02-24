import java.util.*;
public class Lab2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temp. in Fahrenheit = ");
        double temp = sc.nextDouble();
        System.out.println("Temp in Celcius is "+ ((temp-32)*5/9));
    }
}
