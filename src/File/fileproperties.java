package File;

import java.io.File;
import java.io.IOException;

public class fileproperties {
	public static void main(String[] args) throws IOException {
		File f = new File("exp.txt");
		System.out.print("\n Path :" + f.getAbsolutePath() + "\n Length :" + f.length() + "\n Last Modification :"
				+ f.lastModified() + "\n Read :" + f.canRead() + "\n Write :" + f.canWrite());
	}
}
