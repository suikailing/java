package test4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Play {

	public void kai() {
		int i = 0, j = 0, x = 0;
		do {
			Vistable kai1 = new Vistable();
			int s0 = (int) (Math.random() * 3 + 1);
			String s1 = JOptionPane.showInputDialog("请出拳1:剪刀。2:石头。3:布.0:退出：");
			int s2 = Integer.parseInt(s1);
			if (s2 == 0) {
				break;
			} else if (s2 < 0 || s2 > 3) {
				JOptionPane.showMessageDialog(null, "输入错误，重新输入");
				continue;
			}
			JOptionPane.showMessageDialog(null, ("你出" + kai1.sui(s2)) + "\n电脑出" + kai1.sui(s0));
			if (s0 == s2) {
				JOptionPane.showMessageDialog(null, "平局");
				i++;
			} else if ((s0 == 1 && s2 == 3) || (s0 == 2 && s2 == 1) || (s0 == 3 && s2 == 2)) {
				JOptionPane.showMessageDialog(null, "你输了");
				j++;
			} else {
				JOptionPane.showMessageDialog(null, "你赢了");
				x++;
			}
			String s3 = JOptionPane.showInputDialog("是否继续，yes or no");
			if (s3.equals("no")) {
				JOptionPane.showMessageDialog(null, "已退出");
				break;
			}
		} while (true);
		JOptionPane.showMessageDialog(null, ("平局" + i) + ("\n赢了：" + j) + ("\n输了" + x));
	}
}
