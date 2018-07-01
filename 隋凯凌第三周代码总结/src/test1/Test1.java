//求数组的总成绩，平均值，最大最小值
package test1;

import java.util.Scanner;

public class Test1 {
	int nn = sui();
	int a[] = new int[nn];

	// 输入班级人数
	public int sui() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入班级人数");
		int num = input.nextInt();
		return num;
	}

	public void kai() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < nn; i++) {
			System.out.println("请输入成绩:");
			a[i] = input.nextInt();
			if (a[i] > 100 || a[i] < 0) {
				i--;
				System.out.println("输入错误，请重新输入:");
				continue;
			}

		}
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < nn; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public double avg() {

		return sum() / nn;
	}

	public void maxMin() {
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < nn; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println("最高成绩是:" + max);
		System.out.println("最低成绩是:" + min);
	}

	public static void main(String[] args) {
		Test1 skl = new Test1();
		skl.kai();
		System.out.println("总成绩为:" + skl.sum());
		System.out.println("平均值为:" + skl.avg());
		skl.maxMin();
	}
}
