package test4;

import javax.swing.JOptionPane;

public class Vistable {
	public String sui(int s2) {
		String str = "";
		if (s2 == 0) {
			JOptionPane.showMessageDialog(null, "已退出游戏");
			System.exit(0);
		} else if (s2 == 1) {
			str = "剪刀";
		} else if (s2 == 2) {
			str = "石头";
		} else if (s2 == 3) {
			str = "布";
		}
		return str;
	}
}
