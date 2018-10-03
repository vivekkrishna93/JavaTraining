package PolyMorph;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Occurence {
	// a content
	static void match(String a, String b) {
		String pattern = (".*" + b + ".*");
		boolean ismatch = Pattern.matches(pattern, b);
		System.out.println("Vales are" + ismatch);
	}

	static void split(String a, String b) {
		String pattern = b;
		Pattern p2 = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		String[] m = p2.split(a);
		for (String trav : m) {
			System.out.println(trav);
		}
	}

	static void compile(String a, String b) {
		String pattern = (".*" + b + ".*");
		Pattern p2 = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher mat = p2.matcher(b);
		boolean ismatch = mat.matches();

		System.out.println("IS it matched" + ismatch);
	}

	static void startend(String a, String b) {
		String pattern = b;
		Pattern p2 = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
		Matcher mat = p2.matcher(a);
		while (mat.find()) {
			System.out.println("From start" + mat.start());
			System.out.println("From start" + mat.end());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice \n 1)Match \n 2)Split \n 3)compile \n 4)Start & end \n 5) Exit");
			val = sc.nextInt();
			switch (val) {
			case 1:
				System.out.println("Enter the String");
				String ip = sc.next();
				System.out.println("Enter the values to be found");
				String ip2 = sc.next();
				match(ip, ip2);
				break;

			case 2:
				System.out.println("Enter the String");
				sc.nextLine();
				String ip3 = sc.nextLine();
				System.out.println("Enter the values to be found");
				String ip4 = sc.next();
				split(ip3, ip4);
				break;

			case 3:
				System.out.println("Enter the String");
				String ip5 = sc.next();
				System.out.println("Enter the values to be found");
				String ip6 = sc.next();
				compile(ip5, ip6);
				break;
			case 4:
				System.out.println("Enter the String");
				sc.nextLine();
				String ip7 = sc.nextLine();
				System.out.println("Enter the values to be found");
				String ip8 = sc.next();
				startend(ip7, ip8);
				break;
			case 5:

				System.exit(0);

			default:
				System.out.println("Enter the proper choice");
				break;

			}

		} while (val != 0);
	}

}
