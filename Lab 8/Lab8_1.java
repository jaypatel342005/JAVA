public class Lab8_1{
	public static void main(String[] args) {
		try{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = 1;
		for(int i=1;i<=y;i++)
		{
			z = z*x;
		}
		System.out.println("x^y = "+z);
		}

        catch(NumberFormatException e)
        {
            System.out.println("Invalid Input");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("Not enough arguments provided.");
        }
        
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}