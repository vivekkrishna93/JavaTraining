package package_examp;

import java.util.Scanner;

public class Simpleprograms_switch {

	static void rev() {
		String orginal, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be rev");
		orginal = sc.nextLine();
		int length = orginal.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + orginal.charAt(i);

		}
		System.out.println("the reverse is:" + reverse);
	}

	static void amstrong() {
		int c = 0, a, temp;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c) {
			System.out.println(temp+"is armstrong number");
		} else {
			System.out.println(temp+"is not armstrong number");

		}
	}

	static void palindrome() {
		String orginal, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to find palindrome");
		orginal = sc.nextLine();
		int length = orginal.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + orginal.charAt(i);
		}
		System.out.println("the reverse is:" + reverse);
		if (orginal.endsWith(reverse)) {
			System.out.println("The string is palindorme:" + reverse);
		} else {
			System.out.println("The string is not palindorme :" + reverse);
		}
	}

	public static void main(String args[]) {

		int val;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"Enter your choice \n 1)Reverse of string \n 2)Armstrong numer \n 3)Palindrome \n 4) Exit");
			val = sc.nextInt();
			switch (val) {
			case 1:
				rev();

				break;
			case 2:
				amstrong();
				break;

			case 3:
				palindrome();
				break;
			case 4:
				System.exit(0);
				break;

			default:
				System.out.println("Enter the proper choice");
				break;

			}

		} while (val != 0);
	}
}
