//在弹窗中写出老年机的界面
package test1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class OldPhone extends JFrame {
	public void sui() {
		JPanel sui1 = new JPanel();
		JPanel sui2 = new JPanel();
		JTextArea sui3 = new JTextArea(3, 20);
		sui1.add(sui3);
		add(sui1, BorderLayout.NORTH);
		add(sui2, BorderLayout.SOUTH);
		JButton sui4 = new JButton("1");
		JButton sui5 = new JButton("2");
		JButton sui6 = new JButton("3");
		JButton sui7 = new JButton("4");
		JButton sui8 = new JButton("5");
		JButton sui9 = new JButton("6");
		JButton sui10 = new JButton("7");
		JButton sui11 = new JButton("8");
		JButton sui12 = new JButton("9");
		sui2.setLayout(new GridLayout(3, 3));
		sui2.add(sui4);
		sui2.add(sui5);
		sui2.add(sui6);
		sui2.add(sui7);
		sui2.add(sui8);
		sui2.add(sui9);
		sui2.add(sui10);
		sui2.add(sui11);
		sui2.add(sui12);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		OldPhone kailing = new OldPhone();
		kailing.sui();
	}
}
