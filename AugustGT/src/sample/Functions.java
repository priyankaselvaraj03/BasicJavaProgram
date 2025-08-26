package sample;

public class Functions {
	
	public static int addNumber(int a,int b) {
		return a+b;
	}
	
	public static int subNumber(int a,int b) {
		return a-b;
	}
	
	public static int mulNumber(int a,int b) {
		return a*b;
	}
	
	public static int divNumber(int a,int b) {
		return a/b;
	}
	
	
	public static void main(String[] args) {
		System.out.println(addNumber(78, 67));
		System.out.println(subNumber(45, 23));
		System.out.println(mulNumber(3, 5));
		System.out.println(divNumber(5, 5));
	}

}
