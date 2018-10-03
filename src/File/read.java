package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class read {
	public static void main(String[] args) throws IOException {
		File f = new File("exp.txt");
		FileReader fw = new FileReader(f);
		int c;
		while ((c = fw.read()) != -1) {
			System.out.print((char) c);
		}

	}

}
