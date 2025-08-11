package sample;

public class Son extends Father {
	public void education() {
		System.out.println("Education");
	}
	public static void main(String[] args) {
		Son obj=new Son();
		obj.bussiness();
		obj.education();
		obj.vechile();
		obj.property();
	}

}
