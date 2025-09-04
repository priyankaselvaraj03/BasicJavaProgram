package sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class ColEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj = new ArrayList();
		obj.add("gfd");
		obj.add("fg");
		obj.add("edgdrg");
		obj.add("gfd");
		obj.add("gfd");
		obj.set(1, "dhfjg");
		obj.remove(2);
		System.out.println(obj);
		System.out.println(obj.get(0));
		System.out.println(obj.size());
		
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("dhjfg");
		System.out.println(obj1);
	
	
	//Map
	
	HashMap<String,String> country=new HashMap<String,String>();
	country.put("IN","India");
	country.put("US","United States");
	country.put("UK","United Kingom");
	country.replace("IN", "India", "HJDGFJH");
	country.remove("US");
	System.out.println(country);
	System.out.println(country.get("UK"));
	
	LinkedHashMap<String,String> country1=new LinkedHashMap<String,String>();
	country1.put("IN","India");
	country1.put("US","United States");
	country1.put("UK","United Kingom");
	country1.replace("IN", "India", "HJDGFJH");
	country1.remove("US");
	System.out.println(country1);
	System.out.println(country1.get("UK"));
	
	TreeMap<String,String> country2=new TreeMap<String,String>();
	country2.put("IN","India");
	country2.put("US","United States");
	country2.put("UK","United Kingom");
	country2.replace("IN", "India", "HJDGFJH");
	country2.remove("US");
	System.out.println(country2);
	System.out.println(country2.get("UK"));

}
}
