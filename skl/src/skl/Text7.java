package skl;

import java.util.Scanner;

public class Text7 {
	public static void main(String[] args) {
		//输入年份月份
		Scanner input=new Scanner(System.in);
		System.out.println("请依次输入年份月份：");
		int year=input.nextInt();
		int month=input.nextInt();
		//验证输入年份有效性
		if((year>10000)||(year<=0)){
			System.out.println("输入错误");
			System.exit(0);
		}
		//验证输入月份有效性
		if((month>12)||(month<=0)){
			System.out.println("输入错误");
			System.exit(0);
		}
		switch(month){
			case 2:
				if(((year%4==0)&&(year%100!=0))||(year%400==0)){
					System.out.println("此月有29天");
				}else{
					System.out.println("此月有28天");
				}
				break;
			case 4:
			case 6:		
			case 9:
			case 11:
				System.out.println("此月有30天");
				break;
			default:
				System.out.println("此月有31天");
				break;
		}
	}
}
