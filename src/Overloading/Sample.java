package Overloading;

import java.util.Scanner;

class example {
	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("Addition of two values" + sum);
	}
}

class example2 extends example {
	public void add(int a, int b) {
		super.add(a, b);
		int sum = a + b;
		System.out.println("Addition of two values" + sum);
	}
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val;
		example2 ex2 = new example2();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"Enter your choice \n 1)For \n 2)For each \n 3)If & if else \n 4)While \n 5)Overloading \n 6)over-riding");
			val = sc.nextInt();
			switch (val) {
			case 1:
				for_example();
				break;
			case 2:
				foreach_example();
				break;

			case 3:
				if_example();
				break;
			case 4:
				while_example();
				break;
			case 5:
				System.out.println("Enetr the value for subtraction");
				int a = sc.nextInt();
				calculate();
				System.out.println("Overloading");
				calculate(a);
			case 6:
				ex2.add(10, 20);
				break;
			default:
				System.out.println("Enter the proper choice");
				break;

			}

		} while (val != 0);

	}

	static void for_example() {
		Scanner sc1 = new Scanner(System.in);
		int n;
		System.out.println("Enetr the number ovalue need to be printed");
		n = sc1.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("The value is:" + i);
		}

	}

	static void foreach_example() {
		int[] marks = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numebr of values to be enter:");
		int len = sc.nextInt();
		System.out.println("Enter the Marks:");
		for (int i = 0; i < len; i++) {
			marks[i] = sc.nextInt();
		}
		for (int j = 0; j < marks.length; j++) {
			if (marks[j] != 0) {
				System.out.println("Values in array:" + marks[j]);
			}
		}

	}

	static void if_example() {
		System.out.println("Please enter student rollno:");
		Scanner s = new Scanner(System.in);
		int rollno = s.nextInt();
		System.out.println("Please enter student name:");
		String studname = s.next();
		System.out.println("Please enter mark1");
		int mark1 = s.nextInt();
		System.out.println("Please enter mark2");
		int mark2 = s.nextInt();
		System.out.println("Please enter mark3");
		int mark3 = s.nextInt();

		int total = mark1 + mark2 + mark3;
		int average = total / 3;
		String grade = null;
		if (average > 90) {
			grade = "Grade A";

		} else if (average > 80 && average <= 90) {
			grade = "Grade B";
		} else if (average > 60 && average < 79) {
			grade = "Grade c";
		}

		else {
			grade = "Fail";
		}
		System.out.println("Grade is:" + grade);
	}

	static void while_example() {
		int x = 10;
		while (x <= 20) {
			System.out.println("value of x" + x);
			x++;

		}
	}

	static void calculate() {
		System.out.println("Addition of values \t:" + (90 + 10));
	}

	static void calculate(int a) {
		System.out.println("Subtraction of values \t:" + (a - 10));
	}

}
