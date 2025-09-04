package sample;

import java.util.Arrays;

public class Progarm {
	public static void main(String[] args) {
		int year = 1998;
		if (year % 4 == 0) {
			System.out.println("Leap year");
		} else {
			System.out.println("not");
		}

		char y = 'e';
		switch (y) {
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;
		default:
			System.out.println("No");

		}
		// even number
		System.out.println("even number");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("odd number");
		for (int i = 0; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		System.out.println("Sum of 10 natural number");
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		System.out.println("Fibannaci series");
		int a = 0;
		int b = 1;
		for (int i = 1; i <= 10; i++) {
			System.out.println(a + " ");
			int c = a + b;
			a = b;
			b = c;
		}

		// Swapping
		int n1 = 2;
		int n2 = 3;
		int temp = 0;
		temp = n1;
		n1 = n2;
		n2 = temp;

		System.out.println("n1=" + n1 + " n2=" + n2);

		// reverse a number
		int n4 = 4567;
		String s = String.valueOf(n4);
		String s3 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s3 = s3 + s.charAt(i);
		}
		Integer i1 = Integer.parseInt(s3.toString());
		System.out.println(i1);

		int j = 0, k = 0;

		while (n4 > 0) {
			j = n4 % 10;
			k = (k * 10) + j;
			n4 = n4 / 10;
		}

		System.out.println("Reverse a number " + k);

		// palindrome or not

		String s1 = "madam";
		String s2 = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		if (s1.equals(s2)) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}

		// ArmStrong number

		int num1 = 1634;
		String s11 = String.valueOf(num1);
		int arm = 0;
		int l = s11.length();
		for (int i = 0; i < l; i++) {
			String s12 = String.valueOf(s11.charAt(i));
			System.out.println(s12);
			int k1 = Integer.parseInt(s12);
			double k3 = Math.pow(k1, l);
			arm = arm + (int) k3;
			System.out.println(k3);
		}
		System.out.println(arm);
		if (num1 == arm) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not Armstrong");
		}

		// Prime or not
		int num3 = 9;
		int count = 0;

		for (int j1 = 2; j1 <= num3 / 2; j1++) {
			if (num3 % j1 == 0) {
				count++;
			}
		}

		if (count == 0) {

			System.out.println("prime");

		} else {
			System.out.println("Not a prime");
		}

		// Anagram

		String s13 = "prIya";
		String s14 = "pryia";
		String s15 = s13.toLowerCase();
		String s16 = s14.toLowerCase();
		char a1[] = s15.toCharArray();
		char a2[] = s16.toCharArray();

		if (a1.length != a2.length) {
			System.out.println("Not an anagram");
		} else {
			Arrays.sort(a1);
			Arrays.sort(a2);
			if (String.valueOf(a1).equals(String.valueOf(a2))) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not Anagram");
			}
		}

		// Split and reverse a String
		System.out.println("-------Split and reverse a strings---------");
		String b1 = "hello world";
		String b2[] = b1.split(" ");
		String b3 = "";
		for (int i = 0; i < b2.length; i++) {
			b3 = "";
			for (int j1 = b2[i].length() - 1; j1 >= 0; j1--) {

				b3 = b3 + b2[i].charAt(j1);

			}
			System.out.println(b3);
		}

		// Remove space in String
		System.out.println("--------Remove Space in String--------");
		String b4 = "hello world";
		String b5 = "";
		for (int i = 0; i < b4.length(); i++) {
			if (b4.charAt(i) != ' ') {
				b5 = b5 + b4.charAt(i);
			}
		}
		System.out.println("After space remove \n" + b5);

		// Count each character in a String
		System.out.println("------Counting Occurance---------");
		String b6 = "hello world";
		int count1 = 0;
		String b7 = "";
		for (int i = 0; i < b6.length(); i++) {
			count1 = 0;
			if (b6.charAt(i) != ' ') {
				if (!b7.contains(String.valueOf(b6.charAt(i)))) {
					for (int j1 = 0; j1 < b6.length(); j1++) {
						if (b6.charAt(i) == b6.charAt(j1)) {
							count1++;
						}
					}
					b7 = b7 + b6.charAt(i);
					System.out.println(b6.charAt(i) + " = " + count1);
				}
			}
		}

	}
}
