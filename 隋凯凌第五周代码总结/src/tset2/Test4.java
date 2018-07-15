package tset2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Test4 {
	public static void main(String[] args) {
		try {
			Socket sui = new Socket("192.168.28.189", 8888);
			String s1 = JOptionPane.showInputDialog("·¢ËÍ");
			JFileChooser jfc = new JFileChooser();
			InputStream is = new FileInputStream(jfc.getSelectedFile());
			DataInputStream dis = new DataInputStream(is);
			OutputStream os = sui.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			byte buffer[] = new byte[1000 * 1024];
			int aaa = 0;
			if (s1.equals("·¢ËÍ")) {
				int a = jfc.showOpenDialog(null);
				if (a == 0) {
					while ((aaa = dis.read(buffer)) != -1) {
						dos.write(buffer, 0, aaa);
					}

				}
			}
			dos.flush();
			dos.close();
			os.flush();
			os.close();
			dis.close();
			is.close();
			sui.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
