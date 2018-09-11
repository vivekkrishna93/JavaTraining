import java.util.Scanner;

public class Conditonal {
	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks :");
		marks = sc.nextInt();
		if (marks >= 60) {

			System.out.println("passed");
		} else {
			System.out.println("failed");
		}

	}

}
