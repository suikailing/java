package tset1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Test6 {
	public static void main(String[] args) {
		try {

			Reader read = new FileReader(new File("E:/sui.avi"));
			Writer write = new FileWriter(new File("E:/kai.avi"));
			char buffer[] = new char[100 * 1024];
			int aa = 0;
			read.read(buffer);
			while ((aa = read.read(buffer)) != -1) {
				write.write(buffer, 0, aa);
			}
			write.flush();
			write.close();
			read.close();
			/*
			 * InputStream is=new FileInputStream(new File("E:/sui.avi"));
			 * OutputStream os=new FileOutputStream(new File("E:/kai.avi"));
			 * byte a[]=new byte[100*1024]; is.read(a); int aa=0;
			 * while((aa=is.read(a))!=-1){ os.write(a, 0, aa); } os.flush();
			 * os.close(); is.close();
			 */

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
