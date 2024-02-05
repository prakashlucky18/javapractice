package corejava;
interface Sim
{
	
}
class AirtelSim implements Sim
{
	
}
class JioSim implements Sim
{
	
}
class IdeaSim implements Sim
{
	
}
public class Mobile {
	Sim sr=null;
	Mobile(Sim s)// we will give the object in the runtime called dependency injection for achieving loose coupling by constructor
	{
	sr=s;	
	}
	public void setSim(Sim s)//dependency control using method
	{
		sr=s;
	}

	public static void main(String[] args) {
		Mobile mb=new Mobile(new AirtelSim());
		Mobile mb1=new Mobile(new JioSim());
		Mobile mb2=new Mobile();
		mb2.setSim(new IdeaSim());
		
		
	}

}
