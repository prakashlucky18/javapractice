package corejava;
class Human
{
	 private int age;
	 private String name;
	 public int getage()
	 {
		 return age;
	 } 
	 public void setage(int a)
	 {
		 age=a;
	 }
	 public String getname()
	 {
		 return name;
	 } 
	 public void setname(String n)
	 {
		 name=n;
	 }
}

public class Encapsulation {

	public static void main(String[] args) {
		Human obj1=new Human();
		obj1.setage(10);
		obj1.setname("prakash");
		System.out.println(obj1.getage()+" "+obj1.getname());
	}

}
