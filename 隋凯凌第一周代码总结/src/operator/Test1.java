//（1）练习：输入一个三位数，求个位十位百位分别为多少？

package operator;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("请输入一个三位数：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int hundred=num/100;
		int shiwei=num/10%10;
		int gewei=num%10;
		System.out.println("百位数是："+hundred);
		System.out.println("十位数是："+shiwei);
		System.out.println("个位数是："+gewei);
				
	}
}
