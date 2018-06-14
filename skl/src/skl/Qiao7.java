package skl;

import java.util.Scanner;

public class Qiao7 {
	public static void main(String[] args){
		System.out.println("请输入一个数：");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		if((a%7==0)||(a%10==7)){
			System.out.println("敲");
		}else{
			System.out.println("不能敲");
		}	
	}
}
