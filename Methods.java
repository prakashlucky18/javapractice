package corejava;
class Method
{
	public void music()
	{
		System.out.println("music playing...");	
}
	public String newpen(int cost)
	{
		return "pen";
	}
}

public class Methods {

	public static void main(String[] args) {
		Method obj1=new Method();
				obj1.music();
		String str=obj1.newpen(10);
		System.out.println(str);

	}

}
