package skl;

import java.util.Scanner;

public class Runnian {
	public static void main(String[] args) {
		System.out.println("请输入年份：");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if((a<0)||(a>9999)){
			System.out.println("输入无效");
			System.exit(0);//退出当前程序
		}
		if(((a%4==0)&&(a%100!=0))||(a%400==0)){
			System.out.println("闰年");
		}else{
			System.out.println("平年");
		}
	}
}
