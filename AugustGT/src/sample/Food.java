package sample;


class Food1{
	//default contructor
	String name;
	
	//no param
	Food1(){
		name="fires";
	}
	
	Food1(String name){
		this.name=name;
	}
}
public class Food {
	public static void main(String[] args) {
		Food1 obj = new Food1();
		System.out.println(obj.name);
		Food1 obj1 = new Food1("burger");
		System.out.println(obj1.name);
	}
	

}
