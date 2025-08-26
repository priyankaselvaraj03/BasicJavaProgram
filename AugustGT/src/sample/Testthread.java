package sample;

public class Testthread {

	public static void main(String[] args) {
		Dessert obj = new Dessert();
		Maindish obj1 = new Maindish();
		obj.start();
		obj1.start();
	}
}
