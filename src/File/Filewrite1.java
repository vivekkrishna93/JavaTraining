package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Filewrite1 {
	public static void main(String args[]) throws Exception {

		File f = new File("exp.txt");
		if (f.exists()) {
			System.out.println("Already their");
		} else {
			f.createNewFile();
		}

	}

}
