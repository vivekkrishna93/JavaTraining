import java.util.Scanner;

public class EmployeeDetails {
	static int empId;
	static String empName;
	static String designation;
	static double salary;
	static String doj;

	public static void getDetails() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter employee id");
		empId = s.nextInt();
		System.out.println("Enter employee name");
		empName = s.next();
		System.out.println("Enter designation");
		designation = s.next();
		System.out.println("Enter salary");
		salary = s.nextDouble();
		System.out.println("Enter date of joining");
		doj = s.next();
	}

	public static void displayDetails() {
		System.out.println("The employee id is " + empId);
		System.out.println("The employee name is " + empName);
		System.out.println("The employee designation is " + designation);
		System.out.println("The employee salary is " + salary);
		System.out.println("The employee doj is " + doj);
	}

	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.getDetails();
		e.displayDetails();

	}

}
