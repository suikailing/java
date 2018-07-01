//输入身份证号，验证是否合法，并且截取身份证中的出生年月信息。
package test1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("请输入身份证号:");
			String ss = input.next();
			if (ss.length() != 18) {
				System.out.println("输入错误，请重新输入：");
				continue;
			} else {
				String s1 = ss.substring(6, 10);
				String s2 = ss.substring(10, 14);
				System.out.println("出生年份:" + s1 + "\t出生月日:" + s2);
				break;
			}
		}
	}
}
