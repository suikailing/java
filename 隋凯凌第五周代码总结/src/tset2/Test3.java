package tset2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Test3 {
	public static void main(String[] args) {
		ServerSocket sui;
		try {
			sui = new ServerSocket(8888);
			System.out.println("服务器启动");
			Socket sui2 = sui.accept();
			String s1 = JOptionPane.showInputDialog("接收，传送");
			JFileChooser jfc = new JFileChooser();
			InputStream is = sui2.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			OutputStream os = new FileOutputStream(jfc.getSelectedFile());
			DataOutputStream dos = new DataOutputStream(os);
			byte buffer[] = new byte[1000 * 1024];
			int a = 0;
			if (s1.equals("接收")) {
				int c = jfc.showSaveDialog(null);
				if (c == 0) {
					while ((a = dis.read(buffer)) != -1) {
						dos.write(buffer, 0, a);
					}

				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
