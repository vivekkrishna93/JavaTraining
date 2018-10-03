package Expcetion;

import java.util.Scanner;

public class multiple_cache {

	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numarator and denaminator");
		a = sc.nextInt();
		b = sc.nextInt();
		try {
			c = a / b;
			System.out.println("Value is " + c);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		} finally {
			System.out.println("At finally");
		}

	}

}
