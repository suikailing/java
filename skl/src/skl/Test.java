package skl;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("请输入一个数：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num%2==0){
			System.out.println("偶数");
		}else{
			System.out.println("奇数");
		}
	}
}
