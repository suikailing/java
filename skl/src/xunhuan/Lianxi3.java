package xunhuan;

import java.util.Scanner;

public class Lianxi3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份");
		int year=input.nextInt();
		
		if((year>9999)||(year<0)){
			System.out.println("输入错误年份，重新输入：");
			System.exit(0);
		}
//      验证年份的有效性		
		System.out.println("请输入月份");
		int month=input.nextInt();
//      验证月份的有效性			
		if((month>12)||(month<=0)){
			System.out.println("输入错误月份，重新输入：");
			System.exit(0);
		}
		System.out.println("请输入日期");
		int day=input.nextInt();
//       验证日期的有效性	（有问题。2月份也能输入30）
		if((day>31)||(day<=0)){
			System.out.println("输入错误日期，重新输入：");
			System.exit(0);
		}
		int days=0;
		int x=0;
//       输入月份，求出比输入月份小的月份的天数
		for(int i=1;i<month;i++){
			switch(i){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days=31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			case 2:
				if(((year%4==0)&&(year%100!=0))||(year%400==0)){
					days=29;
					break;
				}else{
					days=28;
					break;
				}	
			}
//       验证从1月到输入month月份的中间每个月都有多少天，并且求和。
			x=x+days;
		}
		System.out.println(year+"年1月1日到"+month+"月"+day+"日一共有"+(x+day)+"天");

	}
}
