package corejava;
class Parent
{
 public void run()
 {
	 System.out.println("parent class is executed");
 }
}
class Child extends Parent
{
	public void run()
	{
		 System.out.println("child class is executed");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Child obj1=new Child();
		obj1.run();

	}

}
