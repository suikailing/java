/*作业：
	登录验证文件，调用菜单类，菜单分为管理员，一般身份，和游客。
	对应笔记最后2道题。*/
package test2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {
	public Test1() throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		Scanner sup = new Scanner(new File("E:/suikailing.txt"));
		while (true) {
			System.out.println("请输入账号:");
			String s1 = input.next();
			if (s1.isEmpty()) {
				System.out.println("账号不能为空，重新输入");
				continue;
			}
			System.out.println("请输入密码:");
			String s2 = input.next();
			if (s2.isEmpty()) {
				System.out.println("密码不能为空，重新输入");
				continue;
			}
			String s3 = s1 + s2;
			boolean ret = false;
			MainMenu skl = new MainMenu();
			while (sup.hasNextLine()) {
				String s4 = sup.nextLine();
				if (s3.equals(s4)) {
					ret = true;
					if (s1.equals("隋凯凌")) {
						skl = new GuanLi();
					} else if (s1.equals("孙晴")) {
						skl = new Touist();
					}
					skl.sui();

				}
			}
			if (ret == false) {
				System.out.println("输入错误，重新输入");
				continue;
			}

		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Test1 dudu = new Test1();
	}

}
