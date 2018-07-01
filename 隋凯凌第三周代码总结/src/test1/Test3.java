//冒泡排序，数组排序，并且输出前三名的成绩
package test1;

public class Test3 {
	public static void main(String[] args) {
		int a[] = { 43, 25, 76, 44, 88, 66, 77 };
		int c = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[i]) {
					c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		int x = 1;
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println("第" + x + "名" + a[i]);
			x++;
			if (i == a.length - 3) {
				break;
			}
		}
	}
}
