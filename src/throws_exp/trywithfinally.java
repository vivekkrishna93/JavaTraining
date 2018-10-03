package throws_exp;

import java.util.Scanner;

public class trywithfinally {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers for division");
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			c = a / b;
		} finally {
			System.out.println("I am in finally");
		}
	}
}
