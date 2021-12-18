package class_work;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDriven {

	public static void main(String[] args) 
	{
//		ArrayList<String>al = new ArrayList<>();
//		al.add("https://www.actitime.com/");
//		al.add("admin");
//		//if we add the data in between tomorrow ie Email. 
//		al.add("admin@actitime.com");
//		al.add("manager");
//		//it will Print email instead of password
//		System.out.println(al.get(2));
//		
		HashMap<String, String> map = new HashMap<>();
		map.put("url","https://www.actitime.com/");
		map.put("username", "admin");
		map.put("password","manager");
		// it will get the same Output even if we add the data in between tomorrow
		System.out.println(map.get("password"));
		
		
	}

}
