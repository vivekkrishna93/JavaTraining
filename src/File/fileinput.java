package File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileinput {
	public static void main(String[] args) throws IOException {
		int c;
		File f = new File("exp2");
		FileInputStream inp = null;
		String s = "Welcome to fujitsu two";
		byte[] b = s.getBytes();
		try {
			inp = new FileInputStream(f);
			while ((c = inp.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		inp.close();
	}
}
