public class Lab8_2{
	public static void main(String[] args) {
		int sum=0;
		int i=0;
		while(i<args.length){
			try{
				int nums = Integer.parseInt(args[i]);
				if(nums<0 || nums%20==0 ||(nums>1000 && nums<2000) || nums>7000)
				{
					throw new MyException();
				}
				else{
					sum = sum + nums;
				}
			}
			catch(MyException e)
			{
				e.printStackTrace();
			}

			i++;
		}
		System.out.println("Total Sum = "+sum);
	}
}
class MyException extends Exception{
	public MyException()
	{
		super();
	}
}