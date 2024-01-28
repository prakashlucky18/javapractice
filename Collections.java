package corejava;
import java.util.Map;
import java.util.HashMap;
public class Collections {

	public static void main(String[] args) {
	HashMap<String,Integer> nums=new HashMap<String,Integer>();
	nums.put("prakash",4);
	nums.put("vasu",1);
	nums.put("vamsi",7);
	nums.put("sai",8);
	for(String n:nums.keySet())
		System.out.println("key:"+ n +" "+"value:"+nums.get(n));
	}

}
