package corejava;

public class Exceptions {

	public static void main(String[] args) {
		int i=0;
		int nums[]=new int[4];
		 String str=null;
		try {
			 int a=10/i;
			 System.out.println(nums[5]);
			 System.out.println(str.length());
	}
		catch(ArithmeticException e)
		{
			System.out.println("cannot divide by zero");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("stay in your limit");
		}
		catch(Exception e)
		{
		System.out.println("something went wrong");
		}
	}
}
