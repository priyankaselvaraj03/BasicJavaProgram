package sample;

import java.util.ArrayList;

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
	}

}
