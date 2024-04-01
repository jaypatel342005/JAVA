import java.util.Scanner;
public class Lab8_3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Account a = new Account();
		System.out.println("Enter Bank Balance : ");
		a.bank_balance = sc.nextInt();
		System.out.println("Do you want to deposit or withdraw your money : ");
		String s = sc.next();
		switch(s)
		{
		case "deposit":
			System.out.println("Enter how much money do you want to deposit : ");
			int d = sc.nextInt();
			System.out.println("Bank balance = "+a.deposit(d));
			break;
		case "withdraw":
			try{
			System.out.println("Enter how much money do you want to withdraw :  ");
			int w = sc.nextInt();
			if(w>a.bank_balance)
			{
				throw new InsufficientFundException();
			}
			else{
				System.out.println("Bank balance = "+a.withdraw(w));
			}
			}
			catch(InsufficientFundException e)
			{
				System.out.println("Error Message : Insufficient Funds");
				System.out.println("Bank balance = "+a.bank_balance);
			}
			break;
		}
	}
}
class Account{
	int bank_balance;
	public int deposit(int d){
		bank_balance = bank_balance+d;
		return bank_balance;
	}
	public int withdraw(int w){
		bank_balance = bank_balance-w;
		return bank_balance;
	}
}
class InsufficientFundException extends Exception{
	public InsufficientFundException()
	{
		super();
	}
}