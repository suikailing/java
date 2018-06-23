//（8）参并调用方法计算加减乘除
package test0;

import java.util.Scanner;

public class Calculate {

	public double sui(double a, double b) {
		Scanner input = new Scanner(System.in);
		double num = 0;

		System.out.println("请输入要做的运算:");
		String x = input.next();
		if (x.equals("+")) {
			num = a + b;
		} else if (x.equals("-")) {
			num = a - b;
		} else if (x.equals("*")) {
			num = a * b;
		} else if (x.equals("/")) {
			num = a / b;
		} else {
			System.out.println("输入错误，重新输入");
		}
		return num;

	}

	public static void main(String[] args) {
		Calculate skl = new Calculate();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入2个数");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println(skl.sui(a, b));
	}
}
