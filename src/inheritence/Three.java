package inheritence;

class one {

	public void exp() {
		System.out.println("This is first");

	}
}

class two extends one {

	void exp2() {
		exp();
		System.out.println("This is second");
	}

}

public class Three extends two {
	void exp3() {
		exp2();
		System.out.println("This is third");

	}

	public static void main(String[] args) {

		Three exp_test = new Three();
		exp_test.exp3();
	}

}
