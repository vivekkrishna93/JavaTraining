package Test2;

import java.util.Scanner;

public class Cust_detail {
	// custdetails
	int[] id = new int[50];
	int[] mobile_number = new int[50];
	String[] name = new String[50];
	double[] phone = new double[50];
	String[] item_purchased = new String[50];
	double[] purchase_amount = new double[50];
	int[] quant = new int[50];

	// income
	double profit, invest, amount;

	// inventry

	static int lapotop = 50;
	static int moniter = 50;
	static int ups = 50;
	static int motherboard = 50;
	static int aio = 50;

	// inventry count
	int lapotop_value = 50000;
	int moniter_value = 5000;
	int ups_value = 2100;
	int motherboard_value = 7000;
	int aio_value = 32500;

	int laptopcount, monitercount, upscount, motherboardcount, aiocount;

	int laptop_profit, moniter_profit, ups_profit, motherboard_profit, aio_profit, overll;

	static Scanner sc = new Scanner(System.in);

	void custdetais() {
		System.out.println("\n The available stocks Laptops count:" + lapotop + "\n Monniter count" + moniter
				+ "\n Motherboard count" + motherboard + "\n Aio" + aio);
		System.out.println("Enter the Number of details to be entered");
		int count = sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("Enter the custmer id");
			id[i] = sc.nextInt();
			System.out.println("Enter the name");
			name[i] = sc.next();
			System.out.println("Phone numbere");
			phone[i] = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the items purchased by customer");
			item_purchased[i] = sc.nextLine();
			System.out.println("Enter the number pf quantites");
			quant[i] = sc.nextInt();
			/*
			 * System.out.println("Puchase value"); purchase_amount[i] =
			 * sc.nextDouble();
			 */

			System.out.println("item" + item_purchased[0]);
		}
	}

	void income() {

		invest = (lapotop_value * lapotop) + (moniter_value * moniter) + (ups * ups_value)
				+ (motherboard * moniter_value) + (aio * aio_value);

		laptop_profit = ((lapotop_value * 5) / 100);
		moniter_profit = ((moniter_value * 2) / 100);
		ups_profit = ((ups_value * 1) / 100);
		motherboard_profit = ((motherboard_value * 5) / 100);
		aio_profit = ((aio_value * 8) / 100);

		for (int i = 0; i < item_purchased.length; i++) {
			for (int j = 0; j < quant.length; j++) {
				if (item_purchased[i] != null && quant[j] != 0) {
					if (item_purchased[i].equalsIgnoreCase("laptop")) {
						laptop_profit = laptop_profit * quant[j];
					}
					if (item_purchased[i].equalsIgnoreCase("moniter")) {
						moniter_profit = moniter_profit * quant[j];
					}
					if (item_purchased[i].equalsIgnoreCase("ups")) {
						ups_profit = ups_profit * quant[j];
					}
					if (item_purchased[i].equalsIgnoreCase("motherboard")) {
						motherboard_profit = motherboard_profit * quant[j];
					}
					if (item_purchased[i].equalsIgnoreCase("aio")) {
						motherboard_profit = motherboard_profit * quant[j];
					}
				}
			}

		}
		overll = laptop_profit + moniter_profit + ups_profit + motherboard_profit + aio_profit;
		System.out.println("over all profit is :" + overll);

	}

	void invesement() {
		invest = (lapotop_value * lapotop) + (moniter_value * moniter) + (ups * ups_value)
				+ (motherboard * moniter_value) + (aio * aio_value);

		System.out.println("Over all investment is" + invest);
	}

	void inventry() {

		/*
		 * System.out.println("len" + item_purchased[0]);
		 * System.out.println("quant" + quant[0]); System.out.println("array" +
		 * (lapotop - quant[0]));
		 */

		for (int i = 0; i < item_purchased.length; i++) {
			for (int j = 0; j < quant.length; j++) {
				if (item_purchased[i] != null && quant[j] != 0) {
					if (item_purchased[i].equalsIgnoreCase("laptop")) {
						lapotop = lapotop - quant[j];

					}
					if (item_purchased[i].equalsIgnoreCase("moniter")) {
						moniter = (moniter - quant[j]);
					}
					if (item_purchased[i].equalsIgnoreCase("ups")) {
						ups = (ups - quant[j]);
					}
					if (item_purchased[i].equalsIgnoreCase("motherboard")) {
						motherboard = (motherboard - quant[j]);
					}
					if (item_purchased[i].equalsIgnoreCase("aio")) {
						aio = (aio - quant[j]);
					}

				}
			}

		}
		System.out.println("\n Laptops count:" + lapotop + "\n Monniter count:" + moniter + "\n Motherboard count:"
				+ motherboard + "\n Aio:" + aio);
	}

	public static void main(String[] args) {
		int val;
		Cust_detail cd = new Cust_detail();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"Enter your choice \n 1)investment \n 2)inventry  \n 3)Customer details \n 4)income \n 5) Exit");
			val = sc.nextInt();
			switch (val) {
			case 1:
				cd.invesement();
				break;
			case 2:
				cd.inventry();
				break;
			case 3:
				cd.custdetais();
				break;
			case 4:
				cd.income();
				break;
			case 5:
				System.exit(0);
			default:
				System.out.println("Enter the proper choice");
				break;
			}

		} while (val != 0);

	}

}
