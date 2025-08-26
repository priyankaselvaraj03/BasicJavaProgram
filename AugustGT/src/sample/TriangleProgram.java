package sample;

public class TriangleProgram {

	public static void main(String[] args) {

		int n = 5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------");

		for (int i = n; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("--------------------------------------------");

		int k = n - 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < k) {
					System.out.print(" ");
					// System.out.println("k "+k);
				} else {
					System.out.print("*");

				}
			}
			k--;
			System.out.println();
		}

		System.out.println("-----------------------------------------------");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j < i) {
					System.out.print(" ");
					// System.out.println("k "+k);
				} else {
					System.out.print("*");

				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------------------------");
		
		

	}
}
