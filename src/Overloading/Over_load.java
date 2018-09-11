package Overloading;

import java.util.Scanner;

public class Over_load {

	public static void main(String[] args) {
	
		int val;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice \n 1)addition \n 2)Subratction \n 3)exit");
			val = sc.nextInt();
			switch (val) {
			case 1:
				calculate();
				break;
			case 2:
				System.out.println("Enetr the value for subtraction");
				int a = sc.nextInt();
				calculate(a);

				break;

			case 3:
				System.exit(0);
				break;
			default:

				System.out.println("Enter the proper choice");
				break;

			}

		}
				while (val != 0);

	}

	static void calculate() {
		System.out.println("Addition of values \t:" + (90 + 10));
	}

	static void calculate(int a) {
		System.out.println("Subtraction of values \t:" + (a - 10));
	}

}
