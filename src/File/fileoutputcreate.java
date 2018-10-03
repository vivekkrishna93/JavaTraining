package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class fileoutputcreate {

	public static void main(String[] args) throws IOException {
		File f = new File("exp2");
		FileOutputStream wrt = null;
		String s = "Welcome to fujitsu two";
		byte[] b = s.getBytes();
		try {
			wrt = new FileOutputStream(f);
			wrt.write(b);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		wrt.close();
	}

}
