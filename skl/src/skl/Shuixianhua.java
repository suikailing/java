package skl;

import java.util.Scanner;

public class Shuixianhua {
	public static void main(String[] args) {
		System.out.println("请输入一个五位数：");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int wanwei=a/10000;
		int qianwei=a/1000%10;
		int baiwei=a/100%10;
		int shiwei=a/10%10;
		int gewei=a%10;
		if((gewei==wanwei)&&(shiwei==qianwei)){
			System.out.println("该数是一个水仙花！");
		}else{
			System.out.println("该数不是水仙花数！");
		}
	}
}