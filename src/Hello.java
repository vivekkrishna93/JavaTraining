import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Hello {
	public static void main(String[] args) {
		// concat
		String value_call = name(" ", " ");
		// addition
		int one = 0, two = 0, addition = add(one, two);
		// subtraction
		int sub1 = 0, sub2 = 0, subtractionvalue = sub(sub1, sub2);
		// multiply
		int value1 = 0, value2 = 0, value3 = multi(one, two);
		System.out.println("Full-name:" + value_call);
		System.out.println("Addition-value:" + addition);
		System.out.println("subtraction-value:" + subtractionvalue);
		System.out.println("multiplaction-value:" + value3);

	}

	public static String name(String first, String last) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first name:");
		first = s.next();
		System.out.println("Enter the Second name:");
		last = s.next();
		String val = last.concat(first);
		return val;

	}

	public static int add(int one, int two) {
		int s3 = 0;
		Scanner add = new Scanner(System.in);
		System.out.println("Enter the first number:");
		one = add.nextInt();
		System.out.println("Enter the second number:");
		two = add.nextInt();
		s3 = one + two;
		return s3;

	}

	public static int sub(int sub1, int sub2) {
		int sub3;
		Scanner add = new Scanner(System.in);
		System.out.println("Enter the first number:");
		sub1 = add.nextInt();
		System.out.println("Enter the second number:");
		sub2 = add.nextInt();
		sub3 = sub1 * sub2;
		return sub3;

	}

	public static int multi(int mul1, int mul2) {
		int mul3 = 0;
		Scanner add = new Scanner(System.in);
		System.out.println("Enter the first number:");
		mul1 = add.nextInt();
		System.out.println("Enter the second number:");
		mul2 = add.nextInt();
		mul3 = mul1 * mul2;
		return mul3;

	}

}
