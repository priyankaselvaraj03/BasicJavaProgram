package sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class duplicate {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(45);
		list.add(24);
		list.add(57);
		list.add(57);
		list.add(67);
		list.add(24);
		
		//remove duplicate element
		Collections.sort(list);
		ArrayList<Integer> list1=new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			if(i==list.size()-1) {
				list1.add(list.get(i));
			}
			else if(list.get(i)!=list.get(i+1)) {
				list1.add(list.get(i));
			}
		}
		System.out.println("Remove Duplicate");
		System.out.println(list1);
		
		//reverse a list
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(34);
		list2.add(45);
		list2.add(24);
		list2.add(57);
		list2.add(57);
		list2.add(67);
		list2.add(24);
		ArrayList<Integer> list3=new ArrayList<Integer>();
		for(int i=list2.size()-1;i>=0;i--) {
			list3.add(list2.get(i));
		}
		System.out.println("Reverse a list");
		System.out.println(list3);
		
		//merge two sorted list
		ArrayList<Integer> list4=new ArrayList<Integer>();
		list4.add(34);
		list4.add(45);
		list4.add(24);
		list4.add(57);
		list4.add(57);
		list4.add(67);
		list4.add(24);
		ArrayList<Integer> list5=new ArrayList<Integer>();
		list5.add(35);
		list5.add(46);
		list5.add(26);
		list5.add(56);
		list5.add(24);
		list5.addAll(list4);
		Collections.sort(list5);
		System.out.println("Merger two sorted list");
		System.out.println(list5);
		
		//Common element between two list
		System.out.println("Common elements are");
		ArrayList<Integer> list6=new ArrayList<Integer>();
		list6.add(34);
		list6.add(45);
		list6.add(24);
		list6.add(57);
		list6.add(56);
		list6.add(67);
		ArrayList<Integer> list7=new ArrayList<Integer>();
		list7.add(35);
		list7.add(46);
		list7.add(26);
		list7.add(56);
		list7.add(24);
		for(int i=0;i<list6.size();i++) {
			for(int j=0;j<list7.size();j++) {
				if(list6.get(i)==list7.get(j)) {
					System.out.println(list6.get(i));
				}
			}
		}
		
		//Stack push and pop
		Stack<Integer> s=new Stack<Integer>();
		s.push(67);
		s.push(78);
		s.push(6);
		s.push(7);
		s.push(56);
		s.pop();
		System.out.println("Stack elements are");
		System.out.println(s);
		
		//two maps are equals
		Map<String,String> map=new HashMap<String,String>();
		map.put("IN", "India");
		map.put("US", "United State");
		map.put("UK", "United Kingom");
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("IN", "India");
		map1.put("US", "United State");
		map1.put("UK", "United Kingom");
		map1.put("TY", "United Kingom");
		System.out.println("Two maps are equal or not");
		boolean b=map.equals(map1);
		if(b==true) {
			System.out.println("Two map are equal");
		}else {
			System.out.println("Not equals");
		}
	}

}
