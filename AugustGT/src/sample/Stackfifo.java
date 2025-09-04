package sample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;

public class Stackfifo {
	
	public static void main(String[] args) {
		
		Stack<Integer> obj=new Stack<Integer>();
		obj.push(78);
		obj.push(67);
		obj.push(79);
		obj.push(34);
		obj.pop();
		System.out.println(obj.empty());
		System.out.println(obj.peek());
		System.out.println(obj);
		
		//Hash Set
		System.out.println("-----------HashSet-----------");
		HashSet<String> obj1=new HashSet<String>();
		obj1.add("pink");
		obj1.add("orange");
		obj1.add("red");
		obj1.add("yellow");
		obj1.add("blue");
		obj1.add("red");
		obj1.remove("pink");
		System.out.println(obj.isEmpty());
		System.out.println(obj);
		
		//LinkedHashSet
		System.out.println("-------Linked Hashset---------");
		LinkedHashSet<String> obj2=new LinkedHashSet<String>();
		obj2.add("pink");
		obj2.add("orange");
		obj2.add("red");
		obj2.add("yellow");
		obj2.add("blue");
		obj2.add("red");
		System.out.println(obj2.contains("blue"));
		System.out.println(obj2);
		
		//TreeSet
		System.out.println("-------Tree set---------");
		TreeSet<String> obj3=new TreeSet<String>();
		obj3.add("pink");
		obj3.add("orange");
		obj3.add("red");
		obj3.add("yellow");
		obj3.add("blue");
		obj3.add("red");	
		System.out.println(obj3);
		
		//greater number
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(34);
		list.add(45);
		list.add(24);
		list.add(57);
		list.add(36);
		list.add(38);
		list.add(35);
		list.add(39);
		
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size()-i-1;j++) {
				 if (list.get(j) > list.get(j + 1)) {
	                    int temp = list.get(j);
	                    list.set(j, list.get(j + 1));
	                    list.set(j + 1, temp);
	                }
			}
		}
		System.out.println("-------Sorted order---------");
		System.out.println(list);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(34);
		list1.add(45);
		list1.add(24);
		list1.add(57);
		list1.add(36);
		list1.add(38);
		list1.add(35);
		list1.add(39);
		//sum of two array
		for(int i=0;i<list1.size();i++) {
			int sum=list.get(i)+list1.get(i);
			System.out.println("Sum of number in "+i+" = "+sum);
		}
		//sum of array
		int sum=0;
		for(int i=0;i<list1.size();i++) {
			sum=sum+list.get(i);
			
		}
		System.out.println("Sum of list "+sum);
		
		//Queue
		System.out.println("----------- Queue-----------");
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(67);
		q.add(69);
		q.add(64);
		q.add(78);
		q.add(74);
		q.poll();
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.isEmpty() );
		
		System.out.println("------------Priority Queue-----------");
		PriorityQueue<Integer> p=new PriorityQueue<Integer>();
		p.add(67);
		p.add(69);
		p.add(64);
		p.add(78);
		p.add(74);
		p.poll();// remove minimum number
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println(p.isEmpty() );
		
	}

}
