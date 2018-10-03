package String;

import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		String orginal, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be replaced");
		orginal = sc.nextLine();
		int length = orginal.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + orginal.charAt(i);
			System.out.println("the reverse is:" + reverse);
		}
		System.out.println("the reverse is:" + reverse);
	}

}
