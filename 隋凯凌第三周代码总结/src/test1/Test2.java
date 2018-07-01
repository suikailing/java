/*判断一个数组中有没有您输入的数
（注意不能判断一回就输出一次未找到这个数）*/
package test1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		int a[] = { 12, 43, 56, 45, 87, 67 };
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个数");
		int ss = input.nextInt();
		boolean ret = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ss) {
				System.out.println("数组中有这个数");
				ret = true;
				break;
			}
		}
		if (ret == false) {
			System.out.println("没有这个数");
		}
	}
}
