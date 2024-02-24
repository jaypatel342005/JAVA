import java.util.Scanner;
public class Prime {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,prime;
		System.out.print("Enter starting value: ");
		a = sc.nextInt();
		System.out.print("Enter ending value: ");
		b = sc.nextInt();
		System.out.printf("Your Prime numbers are:\n",a,b);
		for (c=a;c<=b;c++) {
			if (c==1||c==0)
				continue;
			prime=1;
			for (d=2;d<=c/2;++d) {
				if (c%d==0) {
					prime=0;
					break;
				}
			}
			if (prime==1)
				System.out.println(c);
		}
	}
}