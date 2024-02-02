package corejava;
class Cow
{
	public void eat()
	{
		System.out.println("cow is eating");
	}
}
public class AnonymousInner {

	public static void main(String[] args) {
		Cow obj=new Cow()
				{     //Anonymous inner class//
			public void eat()
			{
				System.out.println("cow in  sleeping");
			}
				};
				obj.eat();

	}

}
