package Expcetion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excp_all {
	static Scanner sc = new Scanner(System.in);

	static void atirh() {
		int a = 50, b = 0, c;
		System.out.println("The values are " + a + "/" + b);
		try {
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	static void nulexp() {
		try {
			String a = null;
			System.out.println("We are now going to find charAt(0) when string is null");
			System.out.println(a.charAt(0));
		} catch (NullPointerException e) {
			System.out.println(e);
		}

	}

	static void array_exp() {

		System.out.println("We are trying to add value in array value is : 9");
		try {
			int a[] = new int[5];
			a[6] = 9;

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		}

	}

	static void string_exp() {
		System.out.println("now we are going to input string in integer type");
		System.out.println("Enter the value");
		int a = sc.nextInt();
		try {
			System.out.println(a);
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		int val;
		System.out.println(
				"Enter your choice \n 1)arithmeticException \n 2)nullPointerException \n 3)arrayIndexOutOfBoundsException \n 4)inputMismatchException");
		do {
			val = sc.nextInt();
			switch (val) {
			case 1:
				atirh();
				break;
			case 2:
				nulexp();
				break;
			case 3:
				array_exp();
				break;
			case 4:
				string_exp();
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Enter the proper choice");
			}
		} while (val != 0);
	}

}
