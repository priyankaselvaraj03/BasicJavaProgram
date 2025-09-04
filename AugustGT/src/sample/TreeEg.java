package sample;

public class TreeEg {
	
	int data;
	TreeEg left;
	TreeEg right;
	public TreeEg(int value) {
		this.data=value;
	}
	public static void main(String[] args) {
		TreeEg tree=new TreeEg(1);
		tree.left=new TreeEg(2);
		tree.right=new TreeEg(3);
		System.out.println("Parent Node "+tree.data);
		System.out.println("Child left "+tree.left.data);
		System.out.println("Right child "+tree.right.data);
	}

}
