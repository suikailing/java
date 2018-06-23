//读取文件（依次遍历文件的每行），验证输入内容是否与文件的某一行相等。（用户界面，弹框。）
package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		//文件路径
		Scanner input = new Scanner(new File("E:/suikailing.txt"));
		String str1 = JOptionPane.showInputDialog("请输入姓名:");
		String str2 = JOptionPane.showInputDialog("请输入密码:");
		String str3 = str1 + str2;
		boolean ret = false;
		while (input.hasNextLine()) {
			String str4 = input.nextLine();
			if (str3.equals(str4)) {
				ret = true;
				JOptionPane.showMessageDialog(null, "登陆成功");
				break;
			}
		}
		if (ret == false) {
			JOptionPane.showMessageDialog(null, "输入错误");
		}
	}
}
