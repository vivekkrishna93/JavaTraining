package package_examp;

import java.util.Scanner;

public class Array_Dynamicsort {

	public static void main(String[] args) {
		int temp = 0, temp2 = 0;
		int[] marks = new int[6];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numebr of values to be enter:");
		int len = sc.nextInt();
		System.out.println("Enter the Marks:");
		for (int i = 0; i < len; i++) {
			marks[i] = sc.nextInt();
		}

		for (int k = 0; k <= marks.length; k++) {
			for (int l = k + 1; l < marks.length; l++)
				if (marks[k] > marks[l]) {
					temp = marks[k];
					marks[k] = marks[l];
					marks[l] = temp;

				}

		}
		int rev = ((marks.length) / 2);
		for (int k = rev; k <= marks.length; k++) {
			for (int l = k + 1; l < marks.length; l++)
				if (marks[k] < marks[l]) {
					temp = marks[k];
					marks[k] = marks[l];
					marks[l] = temp;

				}

		}
		System.out.println("Elements in array are");
		for (int sort = 0; sort < marks.length; sort++) {
			if (marks[sort] != 0) {
				System.out.println(marks[sort]);
			}
		}

	}

}
