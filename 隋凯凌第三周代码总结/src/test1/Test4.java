//对数组赋值，并进行升序排序，输出学生成绩的及格率。
//去掉一个最大值，去掉一个最小值求数组的其余值的和
package test1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数组长度");
		int num = input.nextInt();
		int a[] = new int[num];
		for (int i = 0; i < a.length; i++) {
			System.out.println("请输入数组元素");
			a[i] = input.nextInt();
		}
		Arrays.sort(a);
		int i = 0;
		for (; i < a.length; i++) {
			if (a[i] >= 60) {
				break;
			}
		}
		int sum = 0;
		for (int j = 1; j < a.length - 1; j++) {
			sum = sum + a[j];
		}
		System.out.println("去掉最大最小值求和为:" + sum);
		double xy = (double) (num - i) / num;
		System.out.println("及格率为:" + xy * 100 + "%");
	}
}
