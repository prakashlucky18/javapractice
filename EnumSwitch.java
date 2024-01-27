package corejava;
enum Statuse
{
	Running,Failed,Pending,success;
}

public class EnumSwitch {

	public static void main(String[] args) {
		Statuse p=Statuse.success;
		if(p==Statuse.Running)
		{
			System.out.println("All good");
		}
		else if(p==Statuse.Failed)
		{
			System.out.println("Try again");
		}
		else if(p==Statuse.Pending)
		{
			System.out.println("please wait");
		}
		else
		{
			System.out.println("done");
		}
		
		switch(p)
		{
		case Running:
			System.out.println("All good");
			break;
		case Failed:
			System.out.println("Try again");
			break;
		case Pending:
			System.out.println("please wait");
			break;
		default:
			System.out.println("done");
			break;
			
		}
		
		
	}

}
