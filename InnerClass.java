package corejava;
class P
{
	int age ;
	public void show()
	{
		System.out.println("in show");
	}
	    class S
	{
		
			public void config()
			{
				System.out.println("in config");
			}
	}
}
public class InnerClass {

	public static void main(String[] args) {
		 P obj=new P();
		   obj.show();
		   P.S obj1=obj.new S();   //creating object for inner class//
		   obj1.config();

	}

}
