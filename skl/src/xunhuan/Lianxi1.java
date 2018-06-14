package xunhuan;

import java.util.Scanner;

public class Lianxi1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入班级人数：");
		int num=input.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++){
			int x=input.nextInt();
			sum=sum+x;
		}
		int avg=sum/num;
		System.out.println(avg);
	}
}
