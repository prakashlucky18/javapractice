package corejava;

public class Wrapper {

	public static void main(String[] args) {
		int num=7;
		   Integer num1=Integer.valueOf(8);    //boxing//
		   System.out.println(num1);
		   int num2=num1.intValue();    //unboxing//
		   System.out.println(num2);
		   int num3=6;
		   Integer num4=num3;   //AutoBoxing
		   System.out.println(num4);
		   int num5=num4;  //AutoUnBoxing//
		   System.out.println(num5);
		   String str="12";
		   int num6=Integer.parseInt(str);   //converting string to integer
		  System.out.println(num6);
		   int num7=9;
		   String str1=Integer.toString(num7);  //converting integer to String//
		   System.out.println(str1);
		   
	}

}
