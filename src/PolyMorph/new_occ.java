package PolyMorph;

import java.util.Scanner;
import java.util.regex.Pattern;

public class new_occ {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entyer the string");
		String input = sc.nextLine();
		System.out.println("Entyer the occurence to be found");
		String find = sc.next();
		Pattern p2 = Pattern.compile(find, Pattern.CASE_INSENSITIVE);
		String[] cut = p2.split(input);
		for (int i = 0; i <= cut.length; i++) {
			System.out.println(cut[i]);
		}
		int y = cut.length - 1;
		System.out.println("The occurenc count is" + y);

	}
}
