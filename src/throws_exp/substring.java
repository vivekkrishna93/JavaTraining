package throws_exp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class substring {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String");
		String s1 = sc.next();
		System.out.println("Enter the second String");
		String s2 = sc.next();
		String out = null;
		Exception e;
		/*
		 * if (s1.substring(4).equals(s2.substring(4))) {
		 * System.out.println("is substring"); }
		 * 
		 * else { throw new Exception("error"); }
		 */
		for (int i = 0; i < s1.length(); i++) {

			for (int j = 0; j < s2.length(); j++) {
				System.out.println("i =" + s1.charAt(i) + "\nj=" + s2.charAt(j));
				// for (int k = 0; k < 3; k++) {
				if (s1.charAt(i) == s2.charAt(j)) {

					out = "match";
				} else {
					e = new Exception("error");
					out = e.toString();
				}
				// }

			}
		}
		System.out.println(out);

	}

}
