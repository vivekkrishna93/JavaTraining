package throws_exp;

import java.lang.reflect.Executable;
import java.util.Scanner;

class a extends Exception {
	String[] ss;

	a(String[] s) {
		ss = s;
	}

	void show() {

		System.out.println(ss[4]);
	}

}

public class Throws_example {
	public static void main(String args[]) throws Exception {
		String[] arr = new String[3];
		arr[0] = "vivek";
		arr[1] = "krishna";
		arr[4]="dd";
		a a1 = new a(arr);

		a1.show();
	if (true) {
			throw new a(arr);
		}

	}
}
