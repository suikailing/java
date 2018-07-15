package tset1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Test7 {
	public static void main(String[] args) {
		File f1 = new File("E:/suikailing.txt");
		File f2 = new File("E:/sui.txt");
		try {
			InputStream is = new FileInputStream(f1);
			Reader read = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(read);

			OutputStream os = new FileOutputStream(f2);
			Writer write = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(write);
			String a = "";
			while ((a = br.readLine()) != null) {
				bw.write(a + "\r\n");
			}
			bw.flush();
			write.flush();
			os.flush();
			bw.close();
			write.close();
			os.close();
			br.close();
			read.close();
			is.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
