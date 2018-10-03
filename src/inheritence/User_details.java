package inheritence;

import java.util.Scanner;

public class User_details {
	int[] empid = new int[10];
	String[] empName = new String[10];
	String[] designation = new String[10];
	int[] salary = new int[10];
	String[] domain = new String[10];

	public void displayDetails() {
		System.out.println("Enter how many employee details you want to enter");
		int count;
		Scanner s = new Scanner(System.in);
		count = s.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("Please enter Employee id");
			empid[i] = s.nextInt();
			System.out.println("Please enter Employee name");
			empName[i] = s.next();
			System.out.println("Please enter Designation");
			designation[i] = s.next();
			System.out.println("Please enter salary");
			salary[i] = s.nextInt();
			System.out.println("Please enter domain");
			domain[i] = s.next();
		}

	}

	public void show() {
		int highestsalary = salary[0];
		for (int i = 0; i < empid.length; i++) {
			if (salary[i] > highestsalary) {
				highestsalary = salary[i];
			}
		}
		for (int i = 0; i < empid.length; i++) {
			if (salary[i] == highestsalary) {
				System.out.println("Employee ID is : " + empid[i]);
				System.out.println("Employee Name is : " + empName[i]);
				System.out.println("Employee Designation is : " + designation[i]);
				System.out.println("Employee Salary is : " + salary[i]);
				System.out.println("Employee Domain is : " + domain[i]);
			}
		}

	}

	public static void main(String[] args) {
		User_details usd = new User_details();
		usd.displayDetails();
		usd.show();

	}

}
