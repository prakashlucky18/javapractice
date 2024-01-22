package corejava;
class Calculator
{
	
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	
}

public class ClassDemo {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		int result=cal.add(5,7);
		System.out.println("sum is" + result);

	}

}
