package throws_exp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class array_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[50];
		int temp;
		System.out.println("Enter the number of values");
		int val = sc.nextInt();
		System.out.println("Enter the numbers");

		try {
			for (int i = 0; i < val; i++) {
				num[i] = sc.nextInt();
			}
			for (int k = 0; k <= num.length; k++) {
				for (int l = k + 1; l < num.length; l++)
					if (num[k] > num[l]) {
						temp = num[k];
						num[k] = num[l];
						num[l] = temp;
					}
			}
			System.out.println("Elements in array are :");
			for (int sort = 0; sort < num.length; sort++) {
				if (num[sort] != 0) {
					System.out.println(num[sort]);
				}
				
			}
			num[51]=60;
			System.out.println(num[51]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Pls check the program");
		} catch (InputMismatchException e) {
			System.out.println("Pls check the program");
		}
	}

}
