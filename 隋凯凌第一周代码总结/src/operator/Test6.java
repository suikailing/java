//（6）求那一年是闰年，那一年是平年？
package operator;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.println("请输入年份：");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0)){
			System.out.println("该年份是闰年。");
		}else{
			System.out.println("该年份是平年。");
		}
	}
}
