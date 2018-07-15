//实现对文件的加密解密，用文件选择器做。必须用字节流类型，不能用reader和writer写，因为图片是字节传输。
package tset1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class Test5 extends JFrame implements ActionListener {

	JFileChooser jfc = new JFileChooser();
	JButton sui1 = new JButton("加密");
	JButton sui2 = new JButton("解密");

	public Test5() {
		this.add(sui1, BorderLayout.NORTH);
		this.add(sui2, BorderLayout.SOUTH);
		sui1.addActionListener(this);
		sui2.addActionListener(this);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == sui1) {
			File f = new File("E:/suikai.txt");
			int aa = jfc.showOpenDialog(null);
			if (aa == 0) {
				try {
					InputStream is = new FileInputStream(jfc.getSelectedFile());
					OutputStream os = new FileOutputStream(f, true);
					for (int i = 0; i < jfc.getSelectedFile().length(); i++) {
						os.write(is.read() + 2);
					}
					os.flush();
					os.close();
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
		if (arg0.getSource() == sui2) {
			File f = new File("E:/dudu.txt");
			int aa = jfc.showOpenDialog(null);
			if (aa == 0) {
				try {
					InputStream is = new FileInputStream(jfc.getSelectedFile());
					OutputStream os = new FileOutputStream(f, true);
					for (int i = 0; i < jfc.getSelectedFile().length(); i++) {
						os.write(is.read() - 2);
					}
					os.flush();
					os.close();
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

	}

	public static void main(String[] args) {
		Test5 skl = new Test5();
	}

}
