package Simple_programs;

public class pattern2 {
	public static void main(String[] args) {
		for (int y = 1; y <= 5; y++) {
			for (int space = 5; space > y; space--)
				System.out.print(" ");
			for (int x = 1; x <= y; x++)
				System.out.print("*");
			System.out.println();
		}

	}

}
