package Interface_example;

interface first {
	public void Show();
}

public class Interface_exp1 implements first {
	public void display() {
		System.out.println("I am in Non-Interface method");
	}

	public void Show() {
		System.out.println("I am in Interface method");

	}

	public static void main(String args[]) {
		Interface_exp1 ex1 = new Interface_exp1();
		ex1.Show();
		ex1.display();

	}

}
