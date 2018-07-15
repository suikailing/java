package tset1;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test1 extends JFrame implements ActionListener {

	JPanel sui1 = new JPanel();
	JPanel sui2 = new JPanel();
	JTextField kai1 = new JTextField(20);
	JTextField kai2 = new JTextField(20);
	JTextField kai3 = new JTextField(20);

	JButton ling1 = new JButton("+");
	JButton ling2 = new JButton("-");
	JButton ling3 = new JButton("*");
	JButton ling4 = new JButton("/");

	public Test1() {
		this.add(sui1);
		this.add(sui2);
		sui1.setLayout(new GridLayout(3, 1));
		this.add(sui1, BorderLayout.NORTH);
		this.add(sui2, BorderLayout.CENTER);
		sui1.add(kai1);
		sui1.add(kai2);
		sui1.add(kai3);
		sui2.add(ling1);
		sui2.add(ling2);
		sui2.add(ling3);
		sui2.add(ling4);
		ling1.addActionListener(this);
		ling2.addActionListener(this);
		ling3.addActionListener(this);
		ling4.addActionListener(this);
		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String s1 = kai1.getText();
		String s2 = kai2.getText();
		if (s1.isEmpty() || s2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "不能为空");
		} else {

			try {
				int in1 = Integer.parseInt(s1);
				int in2 = Integer.parseInt(s2);
				if (arg0.getSource() == ling1) {
					kai3.setText((in1 + in2) + "");
				} else if (arg0.getSource() == ling2) {
					kai3.setText((in1 - in2) + "");
				} else if (arg0.getSource() == ling3) {
					kai3.setText((in1 * in2) + "");
				} else if (arg0.getSource() == ling4) {
					if (in2 != 0) {
						kai3.setText((in1 / in2) + "");
					} else {
						JOptionPane.showMessageDialog(null, "不能为0");
					}
				}

			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		Test1 skl = new Test1();

	}
}
