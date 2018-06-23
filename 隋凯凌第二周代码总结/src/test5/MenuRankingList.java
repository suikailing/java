package test5;

import javax.swing.JOptionPane;

public class MenuRankingList {

	public void kai2() {
		JOptionPane.showMessageDialog(null, "1:隋凯凌\n2:李华威\n3:田娜");

	}

	public void kai3() {
		JOptionPane.showMessageDialog(null, "电话：18210081762 ");
	}

	public void kai1() {
		String s1 = JOptionPane.showInputDialog("1.排行榜\n2.帮助信息\n3.退出");
		do {
			if (s1.equals("1")) {
				kai2();
				break;
			} else if (s1.equals("2")) {
				kai3();
				break;
			} else if (s1.equals("3")) {
				JOptionPane.showMessageDialog(null, "已经退出系统");
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "输入错误请重新输入");
			}
		} while (true);
	}

}
