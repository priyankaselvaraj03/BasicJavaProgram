package sample;

public class kid1 extends Mom
{

	public void education() {
		System.out.println("IT");
	}
	public static void main(String[] args) {
		kid1 obj=new kid1();
		obj.education();
		obj.money();
	}
}
