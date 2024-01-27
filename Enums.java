package corejava;
enum Status
{
//	name constants defined
	Running,failed,pending,successs,notfound;
}

public class Enums {

	public static void main(String[] args) {
		Status s=Status.Running;
		System.out.println(s.ordinal());
		for(Status myVar:Status.values())
		{
			System.out.println(myVar);
		}
		

	}

}
