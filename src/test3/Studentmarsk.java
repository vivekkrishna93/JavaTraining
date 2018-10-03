package test3;

import java.util.Scanner;

interface student {
	abstract void marks(int a, int b, int c, int d, int e);
}

public class Studentmarsk implements student {
	public void marks(int a, int b, int c, int d, int e) {
		int total = ((a + b + c + d + e) / 5);
		System.out.println("Your Average is :"+total);
		if (total > 90) {
			System.out.println("First class");
		} else if (total >= 70) {
			System.out.println("Second class");
		} else if (total >= 60) {
			System.out.println("Second class");
		} else {
			System.out.println("fail");
		}
	}

	public static void main(String[] args) {
		Studentmarsk obj = new Studentmarsk();
		System.out.println("Enter the five subject marks");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		obj.marks(a, b, c, d, e);

	}

}
