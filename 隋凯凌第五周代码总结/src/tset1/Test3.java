package tset1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Test3 extends JFrame implements ActionListener {
	JFileChooser jfc = new JFileChooser();
	JMenuItem sui1 = new JMenuItem("打开");
	JMenuItem sui2 = new JMenuItem("保存");
	JMenu kai = new JMenu("选项");
	JMenuBar ling = new JMenuBar();
	JTextArea ling2 = new JTextArea(10, 30);

	public Test3() {
		ling.add(kai);
		kai.add(sui1);
		kai.add(sui2);
		this.add(ling2);
		this.setJMenuBar(ling);
		pack();
		setVisible(true);
		sui1.addActionListener(this);
		sui2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == sui1) {
			int aaa = jfc.showOpenDialog(null);
			if (aaa == 0) {
				try {
					Reader read = new FileReader(jfc.getSelectedFile());
					BufferedReader br = new BufferedReader(read);
					int a = 0;
					StringBuffer sb = new StringBuffer();
					while ((a = br.read()) != -1) {
						sb.append(br.readLine() + "\n");
					}
					ling2.setText(sb.toString());
					br.close();
					read.close();

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
			int aa = jfc.showSaveDialog(null);
			if (aa == 0) {
				try {
					Writer skl = new FileWriter(jfc.getSelectedFile(), true);
					BufferedWriter bw = new BufferedWriter(skl);
					bw.write(ling2.getText().replaceAll("\n", "\r\n"));
					bw.flush();
					skl.flush();
					bw.close();
					skl.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}

	public static void main(String[] args) {
		Test3 skl = new Test3();
	}
}
