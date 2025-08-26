package sample;

import java.util.Arrays;

public class PrimitiveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Data types");
		byte age = 21;
		short salary = 30000;
		float height = 687.899f;
		double weight = 6798.800000;
		int accno = 1678977899;
		long addharno = 34556767896789667l;
		char initial = 's';
		boolean isactive = true;
		
		System.out.println(age);
		System.out.println(salary);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(accno);
		System.out.println(addharno);
		System.out.println(initial);
		System.out.println(isactive);
		
		System.out.println("String"); 

		String color="pink";
		System.out.println(color);
		        
		System.out.println("Array");

		String[] colors = {"pink","orange","yellow","blue"};
		System.out.println(Arrays.toString(colors));
		System.out.println(colors[3]);
		
		System.out.println("Arithmetic operator");

		int a=10;
		int b=10;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
     	System.out.println(a%b);
		int c=7;
		c++;
		System.out.println(c);
		int d=9;
		d--;
		System.out.println(d);

		 int a1=45;
		 a1+=4;
		System.out.println(a1);
		
		System.out.println("Comparsion operation");
		
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a!=b);
		System.out.println(a==b);
		
		System.out.println("Logical operation");

		System.out.println((a<b) && (a==b));
		System.out.println((a<b) || (a==b));
		System.out.println(!((a<b) || (a==b)));
		
		// conditional statement
		
		int age1=34;
		if(age>18) {
			System.out.println("Allow to donate blood");
		}else if(age1==18){
			System.out.println("Need to check");
		}else {
			System.out.println("Not allow to donate blood");
		}
		
		int day=1;
		 switch(day) {
		 case 1:
			 System.out.println("Monday");
			 break;
		 case 2:
			 System.out.println("Tuesday");
			 break;
		 case 3:
			 System.out.println("Wednesday");
			 break;
		 case 4:
			 System.out.println("Thursday");
			 break;
		 case 5:
			 System.out.println("Friday");
			 break;
		 case 6:
			 System.out.println("Saturday");
			 break;
		 case 7:
			 System.out.println("Sunday");
			 break;
		default:
			System.out.println("NO day");
		 }
		
	}

}
