package Interface_example;

import java.util.*;
import java.lang.*;

class abc {
	String dis(double length, double breath) {
		double area = length * breath;
		String d = Double.toString(area);
		return d;

	}
}

class Poly_examp extends abc

{
	public String gh() {

		return "Area of rectangle is : " + "" + (super.dis(10.20, 10.2));
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		Poly_examp ex1 = new Poly_examp();
		String s = ex1.gh();
		System.out.println(s);
	}

}
