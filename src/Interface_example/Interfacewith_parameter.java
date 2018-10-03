package Interface_example;

import java.util.Scanner;

interface discount1 {
	public void calculate(double priceamount, String name, double qat);

}

interface discount2 extends discount1 {
	public void discount(Double price, double quantity);
}

public class Interfacewith_parameter implements discount1 {
	public void discount(Double price, double quantity) {
		double per = 0;
		double total_amount = price * quantity;
		if (total_amount >= 500 && total_amount <= 999) {
			per = (total_amount * 10) / 100;
			System.out.println("\n The Dicounted amount u need to pay :" + (total_amount - per));
		} else if (total_amount >= 1000) {
			per = (total_amount * 20) / 100;
			System.out.println("\n The Dicounted amount u need to pay :" + (total_amount - per));
		} else {
			System.out.println("No discount the amount u need to pay is:" + total_amount);
		}
	}

	public void calculate(double priceamount, String name, double qat) {
		double total = priceamount * qat;
		System.out.println("\n Prooduct name :" + name + "\n Total amount :" + total + "\n Quantites s:" + qat);

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of product");
		String name = sc.next();
		System.out.println("Enter the product price");
		double cal = sc.nextDouble();
		System.out.println("Enter the number of quantity");
		int value = sc.nextInt();

		Interfacewith_parameter inp = new Interfacewith_parameter();
		inp.calculate(cal, name, value);
		inp.discount(cal, value);

	}
}
