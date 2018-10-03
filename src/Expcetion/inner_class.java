package Expcetion;

public class inner_class {
	void add() {
		System.out.println("Addition of two numbers:" + (20 + 20));
	}

	class inner_class2 {
		void multiply() {
			System.out.println("Multiplication  of two numbers:" + (20 * 20));
		}

		class inner_class3 {
			void sub() {
				System.out.println("Sub of two numbers:" + (50 - 20));
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inner_class c1 = new inner_class();
		inner_class.inner_class2 c2 = new inner_class().new inner_class2();
		inner_class.inner_class2.inner_class3 c3 = new inner_class().new inner_class2().new inner_class3();
		c1.add();
		c2.multiply();
		c3.sub();

	}

}
