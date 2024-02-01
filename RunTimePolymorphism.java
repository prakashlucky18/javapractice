package corejava;
class a
{
	public void com()
	{
		System.out.println("in class a");
		}
}
class b extends a
{
	public void com()
	{
		System.out.println("in class b");
		}
}
class c extends a
{
	public void com()
	{
		System.out.println("in class c");
		}
}
public class RunTimePolymorphism {

	public static void main(String[] args) {
		
		  a obj =new a();  
	        obj.com();  //Output: in show A

	        obj =new b(); //reference is A (we can use reference of parents) and create object of B  and assign to parents reference variable.
	        obj.com();  //Output: in show B

	        obj =new c();  //reference is A (we can use reference of parents) and create object of C and assign to parents reference variable.
	        obj.com();  //Output: in show C

	}

}
