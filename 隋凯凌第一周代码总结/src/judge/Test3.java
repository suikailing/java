//(3)输入年份和月份，打印输入月份所对应的天数。
package judge;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=input.nextInt();
		if((year>10000)||(year<=0)){
			System.out.println("请重新输入");
			System.exit(0);
		}
		System.out.println("请输入月份:");
		int month=input.nextInt();
		if((month>12)||(month<=0)){
			System.err.println("请重新输入");
			System.exit(0);
		}
		int days=0;
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			days=30;
			break;
		case 2:
			if(((year%4==0)&&(year%100!=0))||(year%400==0)){
				days=29;
			}else{
				days=28;
			}
			break;
		default:
			days=31;
			break;
		}
		System.out.println(month+"月的天数是："+days);
	}
}
