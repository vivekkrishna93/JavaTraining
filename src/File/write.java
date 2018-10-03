package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class write {
	public static void main(String args[]) throws IOException {
		File f = new File("exp.txt");
		FileWriter fw = new FileWriter("exp.txt");
		if (f.exists()) {
			fw.write("Welcome to fujitsu");
		} else {
			System.out.println("File does not available");
		}
		fw.close();
	}

}
