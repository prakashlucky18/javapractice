package corejava;
interface animal
{
	public void sound();
	public void sleep();	
}
class dog implements animal
{
	public void sound()
	{
		System.out.println("bow  bow....")	;
}
	public void sleep()
	{
		System.out.println("uuuuuuu");
	}
}
public class Interfaces {

	public static void main(String[] args) {
		dog d=new dog();
		d.sound();
		d.sleep();
	}
}
