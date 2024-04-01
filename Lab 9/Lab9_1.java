import java.io.*;
public class Lab9_1{
	public static void main(String[] args) {
		Morning m = new Morning();
		Afternoon a = new Afternoon();
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(a);
			t1.start();
			t2.start();

	}
}
class Morning implements Runnable{
	@Override
	public void run(){
		while(true){
		try{
		System.out.println("Good Morning");
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	}
}
class Afternoon implements Runnable{
	@Override
	public void run(){
		while(true){
		try{
		System.out.println("Good Afternoon");
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
}