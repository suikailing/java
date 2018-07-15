package tset1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Test2 extends JFrame implements ActionListener {

	JLabel sui1 = new JLabel("账号");
	JLabel sui2 = new JLabel("密码");
	JLabel sui3 = new JLabel("确认密码");

	JTextField kai1 = new JTextField(20);
	JTextField kai2 = new JTextField(20);
	JTextField kai3 = new JTextField(20);
	JButton ling1 = new JButton("注册");
	JButton ling2 = new JButton("取消");
	private Writer aa;

	public Test2() {
		this.setLayout(new GridLayout(4, 2));
		this.add(sui1);
		this.add(kai1);

		this.add(sui2);
		this.add(kai2);

		this.add(sui3);
		this.add(kai3);

		this.add(ling1);
		this.add(ling2);
		ling1.addActionListener(this);
		ling2.addActionListener(this);

		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = kai1.getText();
		String s2 = kai2.getText();
		String s3 = kai3.getText();
		if (s1.isEmpty() || s2.isEmpty() || s3.isEmpty()) {
			JOptionPane.showMessageDialog(null, "不能为空");
		} else if (!s2.equals(s3)) {
			JOptionPane.showMessageDialog(null, "密码必须一致");
		} else {
			if (e.getSource() == ling1) {
				File f = new File("E:/suikailing.txt");
				try {
					boolean ret = false;
					Reader read = new FileReader(f);
					BufferedReader bread = new BufferedReader(read);
					int a = 0;
					while ((a = bread.read()) != -1) {
						String s4 = bread.readLine();
						int s5 = s4.indexOf("#");
						String s6 = s4.substring(0, s5);
						if (s6.equals(s1)) {
							ret = true;
							JOptionPane.showMessageDialog(null, "账户已经被注册");
							break;
						}
					}
					if (ret == false) {

						JOptionPane.showMessageDialog(null, "注册成功");
						aa = new FileWriter(f, true);
						String s7 = s1 + "#" + s2;
						System.out.println(s7);
						aa.write(s7 + "\r\n");
						aa.flush();
						aa.close();

					}

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}

	}

	public static void main(String[] args) {
		Test2 skl = new Test2();
	}
}
