package Frame_oops;

import java.util.Scanner;

interface mark {
	public void calculate(double mark1, double mark2, double mark3);

}

abstract class calculation implements mark {
	public void calculate(double mark1, double mark2, double mark3) {
		double total = ((mark1 + mark2 + mark3) / 3);
		System.out.println("The average is " + total);

	}

}

class Interface_abstract extends calculation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three marks");
		double m1 = sc.nextInt();
		double m2 = sc.nextInt();
		double m3 = sc.nextInt();
		Interface_abstract ia = new Interface_abstract();
		ia.calculate(m1, m2, m3);

	}

}
