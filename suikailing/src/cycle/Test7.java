//（7）求从某年1月1日开始，到某年某月某日为止，一共有多少天？
package cycle;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=input.nextInt();
		System.out.println("请输入月份:");
		int month=input.nextInt();
		System.out.println("请输入日期:");
		int day=input.nextInt();
		int monthday=0,sum=0;
		for(int i=1;i<month;i++){
			switch(i){
			case 4:
			case 6:
			case 9:
			case 11:
				monthday=30;
				break;
			case 2:
				if(((year%4==0)&&(year%100!=0))||(year%400==0)){
					monthday=29;
				}else{
					monthday=28;
				}
				break;
			default:
				monthday=31;
			}
			sum=sum+monthday;
		}
		System.out.println("总天数为："+(sum+day));
	}
}
