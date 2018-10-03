package PolyMorph;

import java.util.Scanner;

class a {

	static void total(int m1, int m2, int m3) {
		int marks = m1 + m2 + m3;
		System.out.println("The total marks is=" + marks);
	}

}

class b extends a {

	static void total(int m1, int m2, int m3) {
		int average = m1 + m2 + m3;
		int av2 = average / 3;

		System.out.println("The average is:" + av2);

	}

}

public class Poly_new extends b {
	static void total(int m1, int m2, int m3) {
		int t = (m1 + m2 + m3) / 3;
		if (t >= 90) {
			System.out.println("Distinction");

		} else if (t > 80 && t <= 90) {
			System.out.println("First class");

		} else if (t > 60 && t < 79) {
			System.out.println("Second class");
		}

		else {
			System.out.println("Fail");
		}
	}

	public static void main(String args[]) {
		Poly_new c1 = new Poly_new();
		Poly_new c2 = new Poly_new();
		Poly_new c3 = new Poly_new();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three subject marks");
		int t = sc.nextInt();
		int t2 = sc.nextInt();
		int t3 = sc.nextInt();
		c1.total(t, t2, t3);
		c2.total(t, t2, t3);
		c3.total(t, t2, t3);

	}

}
