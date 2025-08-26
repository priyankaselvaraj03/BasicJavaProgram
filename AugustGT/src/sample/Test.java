package sample;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {12,3,5,63,56};
		int b[]= {12,3,5,56};
		System.out.println(Arrays.equals(a, b));
		System.out.println(a.length);
		
		System.out.println(Arrays.compare(a, b));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int number[]= {10,20,30,40};
		System.out.println("Single dimension array");
		for(int i=0;i<number.length;i++)
		{
			System.out.println("Elements at index "+i+" : "+number[i]);
		}
		
		// Two dimensional array
		
		int n[][]= {{1,2,3,4,5},{4,5,6,6,7},{7,8,9,6,7},{10,11,12,5,7}};
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n[i].length;j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();
		}
		
		int n1[][][]= {{{1,2,3},{4,5,6}},
					   {{7,8,9},{3,4,5}},
				       {{4,6,8},{5,6,8}}};
		for(int i=0;i<n1.length;i++) {
			for(int j=0;j<n1[i].length;j++) {
				for(int k=0;k<n1[i][j].length;k++) {
					System.out.print(n1[i][j][k]+" ");
				}
				System.out.println();
			}
		}
		
		int n3[][]= {{1,2,3,4,5},{4,5,6,6,7},{7,8,9,6,7},{10,11,12,5,7}};
		int n4[][]= {{1,2,3,4,5},{4,5,6,6,7},{7,8,9,6,7},{10,11,12,5,7}};

		for(int i=0;i<n3.length;i++) {
			for(int j=0;j<n3[i].length;j++) {
				System.out.print(n3[i][j]+n4[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
