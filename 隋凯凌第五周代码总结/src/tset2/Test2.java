package tset2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Test2 {
	public static void main(String[] args) {
		try {
			while (true) {
				Socket sui1 = new Socket("192.168.28.189", 1212);
				OutputStream os = sui1.getOutputStream();
				DataOutputStream dos = new DataOutputStream(os);
				String ss = JOptionPane.showInputDialog("隸舜");
				dos.writeUTF(ss);
				InputStream is = sui1.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				String sss = dis.readUTF();
				JOptionPane.showMessageDialog(null, sss);

				if (ss.equals("問問") || sss.equals("問問")) {
					dis.close();
					is.close();
					dos.flush();
					os.flush();
					dos.close();
					os.close();
					sui1.close();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
