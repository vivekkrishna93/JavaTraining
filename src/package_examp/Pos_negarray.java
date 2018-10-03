package package_examp;

import java.util.Scanner;

public class Pos_negarray {
	public static void main(String args[]) {
		int temp = 0;
		int[] marks = new int[50];
		int countpos = 0;
		int countneg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numebr of values to be enter:");
		int len = sc.nextInt();
		System.out.println("Enter the Marks:");
		for (int i = 0; i < len; i++) {
			marks[i] = sc.nextInt();
		}

		for (int sort = 0; sort < marks.length; sort++) {
			if (marks[sort] != 0) {
				if (marks[sort] >= 0) {
					countpos++;
					System.out.println("Postitve numbers"+marks[sort]);
				}

				if (marks[sort] <= 0) {
					countneg++;
					System.out.println("Negtive numbers"+marks[sort]);
				}

			}

		}
		System.out.println("Total postive array :" + countpos);
		System.out.println("Total Negtive array :" + countneg);
	}

}
