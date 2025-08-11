package sample;

public class hdfc extends Bank {
	@Override
	void current() {
		// TODO Auto-generated method stub
		System.out.println("current acc");
	}

	@Override
	void salary() {
		// TODO Auto-generated method stub
		System.out.println("salary acc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hdfc obj = new hdfc();
		obj.current();
		obj.salary();
		obj.saving();
	}

	

}
