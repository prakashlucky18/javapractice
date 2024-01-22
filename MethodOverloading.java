package corejava;
class Demo
{
	public int add(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
	public double add(double n1,double n2)
	{
		return n1+n2;
	}
	
}

public class MethodOverloading {

	public static void main(String[] args) {
		Demo calc=new Demo();
		 double result=calc.add(9.0, 8);
		 System.out.println(result);

	}

}
