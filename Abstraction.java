package corejava;
//abstract class
 abstract class Car
{
//	 abstract methods and normal methods
	 public abstract void drive();  
	public void music()
	{
		System.out.println("music playing");
	}
}
// abstract class
abstract class Tesla extends Car
 {
//	implement the abstract method
	 public void drive()
	 {
		 System.out.println("driving..."); 
	 }
//	 abstract method
	 public abstract void fly();
 }
 class Bmw extends Tesla
 {
//	 implement the abstract method
	 public void fly()
	 {
		 System.out.println("flying...."); 
	 }
 }
public class Abstraction {

	public static void main(String[] args) {
//		we cannot create objects for abstract classes create objects only for normal classes 
		Bmw obj1=new Bmw();
		obj1.music();
		obj1.drive();
		obj1.fly();

	}

}
