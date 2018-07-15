package tset1;

import java.awt.HeadlessException;
import java.io.BufferedInputStream;

import javax.swing.JOptionPane;

public class you {

	public static void main(String[] args) {
		try {
			String s1 = JOptionPane.showInputDialog(null, "请输入一个数字");
			int s2 = Integer.parseInt(s1);
		} catch (HeadlessException | NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
