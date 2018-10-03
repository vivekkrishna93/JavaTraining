package Frame_oops;

import java.util.Scanner;

abstract class salary {
	abstract String show();

}

public class inherit_abstract extends salary {
	public String show() {
		int temp = 0;
		int[] salary = new int[50];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numebr of salary to be enter:");
		int len = sc.nextInt();
		System.out.println("Enter the salary");
		for (int i = 0; i < len; i++) {
			salary[i] = sc.nextInt();
		}
		for (int k = 0; k <= salary.length; k++) {
			for (int l = k + 1; l < salary.length; l++)
				if (salary[k] > salary[l]) {
					temp = salary[k];
					salary[k] = salary[l];
					salary[l] = temp;

				}

		}
		String d = Double.toString(salary[salary.length - 2]);
		return d;
		//System.out.println("The second largest element is:" + (salary[salary.length - 2]));
	}

	public static void main(String[] args) {
		inherit_abstract ia = new inherit_abstract();
		ia.show();

	}

}
