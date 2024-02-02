package corejava;
class X
{
	public void show1()
	{
		System.out.println("in x show");
		}
}
class Y extends X
{
	 public void show2()
		{
			System.out.println("in y show");
			}
}
public class Casting1 {

	public static void main(String[] args) {
		  X obj=new Y();     //upcasting//
		    obj.show2();  //you get error and you are not able to call show2() because with parennts reference specialised method of child is not visible//
			((Y)obj).show2();   //downcasting//
			
	}

}
