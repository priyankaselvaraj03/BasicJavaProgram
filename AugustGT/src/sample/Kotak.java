package sample;

public class Kotak implements Banks {

	@Override
	public void current() {
		// TODO Auto-generated method stub
		System.out.println("current acc");
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("salary acc");
	}
public static void main(String[] args) {
	Kotak obj = new Kotak();
	obj.current();
	obj.salary();
}
}
