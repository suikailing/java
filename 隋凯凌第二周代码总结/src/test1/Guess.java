//生成一个随机数，猜这个随机数。
package test1;

import java.util.Scanner;

public class Guess {
	public static void main(String[] args) {
		int num1 = (int) (Math.random() * 100 + 1);
		System.out.println(num1);
		Scanner input = new Scanner(System.in);
		System.out.println("请输入猜测数字");
		int i = 1;
		do {
			int num2 = input.nextInt();
			if (num2 > num1) {
				System.out.println("猜测的数大了，请重新猜测");
			} else if (num1 > num2) {
				System.out.println("猜测的数小了请重新猜测");
			} else {
				System.out.println("恭喜你猜对了");
				break;
			}
			i++;
		} while (true);
		System.out.println("共猜了" + i + "次");
	}
}
