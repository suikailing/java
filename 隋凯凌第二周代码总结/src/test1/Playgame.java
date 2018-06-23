//循环玩石头剪刀布游戏
package test1;

import java.util.Scanner;

public class Playgame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for (int i = 1; i < 50; i++) {
			System.out.println("请输入剪刀，石头，布：");
			int str1 = input.nextInt();
			int str2 = (int) (Math.random() * 3 + 1);
			System.out.println(str2);
			if (str1 == 1 || str1 == 2 || str1 == 3) {
				if (str1 == str2) {
					System.out.println("平局");
				} else if (((str1 == 1) && (str2 == 3)) || ((str1 == 2) && (str2 == 1))
						|| ((str1 == 3)) && (str2 == 2)) {
					System.out.println("恭喜你赢了");
				} else {
					System.out.println("你输了");
				}
			} else {
				System.out.println("输入错误，请继续");
				continue;
			}
			System.out.println("输入no退出游戏");
			String str3 = input.next();
			if (str3.equals("no")) {
				System.out.println("已经退出游戏");
				System.exit(0);
			}
		}
	}
}
