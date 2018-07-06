package test1;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Test1 extends JFrame implements ActionListener {
	JPanel sui1 = new JPanel();
	JPanel sui2 = new JPanel();
	JButton sui3 = new JButton("上传");
	JTextArea sui4 = new JTextArea(9, 20);
	JLabel sui9 = new JLabel("请输入文件名字");
	JTextField sui8 = new JTextField(15);
	public Test1() {
		sui1.add(sui9);
		sui1.add(sui8);
		sui1.add(sui3);
		sui2.add(sui4);
		this.add(sui1, BorderLayout.NORTH);
		this.add(sui2, BorderLayout.SOUTH);
		sui3.addActionListener(this);
		this.pack();
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == sui3) {
			try {
				Scanner input = new Scanner(new File("E:/" + sui8.getText()));
				StringBuffer sui5 = new StringBuffer();
				while (input.hasNextLine()) {
					sui5.append(input.nextLine() + "\n");
					sui4.setText(sui5.toString());
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Test1 skl = new Test1();
	}}