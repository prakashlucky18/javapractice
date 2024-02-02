package corejava;
abstract class Run
{
	public abstract void run();
	public abstract void walk();
}
public class AbstarctInner {
	public static void main(String[] args)
	{
	Run pra=new Run()
	  {
public void run()
	{
		System.out.println("i am running now");
	}
public void walk()
	{
		System.out.println("i am walking now");
	}
	  };
	  pra.run();
	  pra.walk();
}
}
