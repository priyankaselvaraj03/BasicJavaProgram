package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionEg {
	
	public static void main(String[] args) {
	//	System.out.println(10/0);
		
		//InputMismatchException
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		int a[]= {4,5,7};
	//	System.out.println(a[6]);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(5);
		list.add(4);
	//	System.out.println(list.get(6));
		
	//	String s=null;
	//	System.out.println(s.length());
		
		String s1="apple";
	//	char c=s1.charAt(7);
	//	System.out.println(c);
		
		String s2="12";
		int a1=Integer.parseInt(s2);
		System.out.println(a1+10);
		
		String s3="12a";
	//	int a2=Integer.parseInt(s3);
	//	System.out.println(a2);
		
		
		//java.lang.ArithmeticException: / by zero
	//	try {
	//		System.out.println(10/0);
	//	}catch (Exception e) {
			// TODO: handle exception
	//		e.printStackTrace();
	//	}
		
	}

}
