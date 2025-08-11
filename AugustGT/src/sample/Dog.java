package sample;

public class Dog {
	public void animal() {
		System.out.println("Dog says bow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj = new Cat();
		obj.animal();
		
		Dog obj1=new Dog();
		obj1.animal();
	}

}
