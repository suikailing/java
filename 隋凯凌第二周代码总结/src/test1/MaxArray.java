//求出随机产生数组的最大值。
package test1;

public class MaxArray {
	/*
	 * public static void main(String[] args) { int arr[] = new int[10]; int max
	 * = arr[0]; for (int i = 0; i < 10; i++) { arr[i] = (int) (Math.random() *
	 * 100 + 1); System.out.print(arr[i] + "\t"); } for (int j = 1; j < 9; j++)
	 * { if (max < arr[j]) { max = arr[j]; } } System.out.println();
	 * System.out.println(max); }
	 */
	public int skl() {
		int arr[] = new int[10];
		int max = arr[0];
		for (int i = 0; i < 10; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		for (int j = 1; j < 9; j++) {
			if (max < arr[j]) {
				max = arr[j];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		MaxArray sui = new MaxArray();
		System.out.println(sui.skl());
	}
}
