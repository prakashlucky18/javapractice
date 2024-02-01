package corejava;

  final class Pen
{
	public   final void write()
	{
		System.out.println("writing with pen");
	}
}
class Pencil extends Pen //we canot inherit final class
{
	public  void write()  //we cannot override final methods
	{
		System.out.println("writing with pencil");
	}
}
public class Final {

	public static void main(String[] args) {
		Pen obj1=new Pen();
		obj1.write();

	}

}
