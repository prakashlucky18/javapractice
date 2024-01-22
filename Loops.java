package corejava;

public class Loops {

	public static void main(String[] args) {
		int a=30;
		int b=20;
//	 if else loop
		if (a>b)       
			System.out.printf("%d is big number\n",a);
		else 
			System.out.printf("%d small  number\n",b);
//		if else if loop
		int x=20;
		int y=30;
		int z=40;
		if(x>y && x>z)
			System.out.printf("%d is big number\n",x);
		else if (y>z)
			System.out.printf("%d is big number\n",y);
		else 
			System.out.printf("%d is big number\n",z);
		
//		switch case 
		int n=1;
		switch(n)
		{
		case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		}
//		ternary operator(?:)
		int c=9;
		int  result=0;
		result=x%2==0?10:20;
		System.out.println(result);
		
	}

}
