package String;

import java.util.Scanner;

public class string_manipulate {
	static void cases(String s) {
		String uper = s.toUpperCase();
		String lower = s.toLowerCase();
		System.out.println("Upper and lower case+" + uper + "\n" + lower);

	}

	static void len(String s2) {
		int len_exp = s2.length();
		System.out.println("Length of value" + len_exp);

	}

	static void cha(String s3) {
		System.out.println("Enter the charater index to be found");
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		char len_exp = s3.charAt(val);
		System.out.println(len_exp);
	}

	static void ind(String s4) {
		System.out.println("Enter the charater to be found");
		Scanner sc = new Scanner(System.in);
		String val = sc.next();
		int fin_val = val.indexOf(val);
		System.out.println(fin_val);

	}

	static void addofstring(String s5, String s6) {
		String con_cat = s5 + s6;
		System.out.println("Concat values:" + con_cat);
	}

	static void sub_string() {
		System.out.println("The input string is: Fujitsu consulting");
		String input = "Fujitsu consulting";
		System.out.println("The substring value is 6" + input.substring(6));
	}

	static void replace(String s7) {
		Scanner sc = new Scanner(System.in);
		String rep_string = sc.next();
		System.out.println("Enter the character form word to be replaced");
		String one = sc.next();
		System.out.println("Enter the replacement word");
		String two = sc.next();
		String rep = rep_string.replace(one, two);
		System.out.println(rep);
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int val;

		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"Enter your choice \n 1)Upper and lower case \n 2)length \n 3)Charat[] \n 4)Indexof \n 5)Concat \n 6)Substring \n 7)replace \n 8) Exit");
			val = sc.nextInt();
			switch (val) {
			case 1:
				System.out.println("Enter the string");
				String sc1 = sc.next();
				cases(sc1);

				break;
			case 2:
				String sc2 = sc.next();
				len(sc2);
				break;

			case 3:
				String sc3 = sc.next();
				cha(sc3);
				break;
			case 4:
				String sc4 = sc.next();
				ind(sc4);
				break;
			case 5:
				String sc5 = sc.next();
				String sc6 = sc.next();

				addofstring(sc5, sc6);
				break;
			case 6:
				sub_string();
				break;
			case 7:
				String sc8 = sc.next();
				replace(sc8);
				break;
			case 8:
				System.exit(0);
			default:
				System.out.println("Enter the proper choice");
				break;

			}

		} while (val != 0);

	}

}
