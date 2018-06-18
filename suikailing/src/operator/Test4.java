//（4）练习：从控制台输出2个字符，判断是否相等，相等打印1，不等打印0.
package operator;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个字符：");
		int str1=input.nextInt();
		System.out.println("请输入第二个字符:");
		int str2=input.nextInt();
		int ret=(str1==str2)?1:0;
		System.out.println("输出结果是："+ret);
		
	}
}
