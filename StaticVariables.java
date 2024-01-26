package corejava;
class Mobile
{
	String model;
	int price;
//	Static variables shared among all the objects
	 static String name;
	
	public void show()
	{
		System.out.println(model+" : "+price+" : "+name);
	}
	public static void show1(Mobile obj1)
	{
//		Accessing the non static members
		System.out.println(obj1.model+" : "+obj1.price+" : "+name);
	}
}

public class StaticVariables {

	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		obj1.model="apple";
		obj1.price=100000;
//		shared for both obj1 and obj2
		Mobile.name="phones";
		Mobile obj2=new Mobile();
		obj2.model="realme";
		obj2.price=20000;
		
		obj1.show();
		obj2.show();
//		acccessing the non static members
		Mobile.show1(obj1);

	}

}
