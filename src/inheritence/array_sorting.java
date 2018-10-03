package inheritence;

import java.util.Scanner;

public class array_sorting {
	public static void main(String[] args) {
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
	/*	
		 * for (int k = 0; k <= marks.length; k++) { for (int l = k + 1; l <
		 * marks.length; l++) if (marks[k] > marks[l]) { temp = marks[k];
		 * marks[k] = marks[l]; marks[l] = temp;
		 * 
		 * }
		 * 
		 * }
		 */

		for (int sort = 0; sort < marks.length; sort++) {
			if (marks[sort] != 0) {
				if (marks[sort] >= 0) {
					countpos++;

				}

				if (marks[sort] <= 0) {
					countneg++;

				}

			}

		}
		System.out.println("Total postive array :" + countpos);
		System.out.println("Total Negtive array :" + countneg);

	}

}
