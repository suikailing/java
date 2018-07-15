package tset1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test4 {
	public static void main(String[] args) {
		File f1 = new File("E:/suikailing.txt");
		File f2 = new File("E:/sui.txt");
		try {
			InputStream is = new FileInputStream(f1);
			OutputStream os = new FileOutputStream(f2, true);
			for (int i = 0; i < f1.length(); i++) {
				os.write(is.read());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
