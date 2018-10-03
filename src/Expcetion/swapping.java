package Expcetion;

import java.util.Scanner;

public class swapping {
	public static void main(String args[]) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("Values of a,b & c before swapping is" + a + "\t" + b + "\t" + c);
		a = a + b + c;
		b = a - (b + c);
		c = a - (b + c);
		a = a - (b + c);
		System.out.println("Values of a,b & c before swapping is" + a + "\t" + b + "\t" + c);
	}
}
