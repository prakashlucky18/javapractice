package corejava;
class Calc
{
	public int add(int n1,int n2)
	{
		return n1+n2;
	}
	public int sub(int n1,int n2)
	{
		return n1-n2;
	}
}
class AdvCal extends Calc
{
	public int mul(int n1,int n2)
	{
		return n1*n2;
	}
	public int div(int n1,int n2)
	{
		return n1/n2;
	}
}
class VeryAdvCal extends AdvCal
{
	public double power(int n1,int n2)
	{
		return Math.pow(n1, n2);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		VeryAdvCal obj1=new VeryAdvCal();
		int r1=obj1.add(5, 8);
		int r2=obj1.sub(7,3);
		int r3=obj1.mul(9,7);
		int r4=obj1.div(10,5);
		double r5=obj1.power(5,7);
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);

	}

}
