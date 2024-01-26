package corejava;
class Mobile
{
	String model;
	int price;
	 static String name;
	
	public void show()
	{
		System.out.println(model+" : "+price+" : "+name);
	}
}

public class StaticVariables {

	public static void main(String[] args) {
		Mobile obj1=new Mobile();
		obj1.model="apple";
		obj1.price=100000;
		Mobile.name="phones";
		Mobile obj2=new Mobile();
		obj2.model="realme";
		obj2.price=20000;
		obj1.show();
		obj2.show();

	}

}
