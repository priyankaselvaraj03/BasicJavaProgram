package sample;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//do while
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		
		// jumping statement
		System.out.println("Jumping statement");
		System.out.println("Break");
		
	
		for(int j=0;j<=10;j++) {
			if(j==4) {
				break;	
			}
			System.out.println(j);

		}
		
		System.out.println("Continue");
		for(int j=0;j<=10;j++) {
			if(j==4) {
				continue;	
			}
			System.out.println(j);

		}
		// math methods
		System.out.println("MAth methods");
		System.out.println(Math.random());
		System.out.println(Math.abs(-89));
		System.out.println(Math.round(89.890));
		System.out.println(Math.ceil(8.20));
		System.out.println(Math.floor(8.9));
		System.out.println(Math.sqrt(64));
		System.out.println(Math.PI);
		
		
		System.out.println(Math.round(Math.random()*10000));
		
		//String
		System.out.println("String");
		
		String s="apple";
		String s1="eat";
		
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(3));
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s1.concat(s));
		System.out.println(s1.equals(s1));
		
		//String BUffer
		StringBuffer obj = new StringBuffer("hello");
		obj.append(" all");
		System.out.println(obj);
		
		StringBuffer obj1 = new StringBuffer("hlo");
		obj1.insert(1,"el");
		System.out.println(obj1);
		
		StringBuffer obj2 = new StringBuffer("hello");
		obj2.reverse();
		System.out.println(obj2);
		
		StringBuffer obj3 = new StringBuffer("hhello");
		obj3.delete(1,2);
		System.out.println(obj3);
		
		StringBuffer obj4 = new StringBuffer("hallo");
		obj4.replace(1,2,"e");
		System.out.println(obj4);
		
		
		
	}

}
