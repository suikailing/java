package shuzhu;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int a[]={21,52,46,98};
		int sum=0;
		System.out.println("请输入一个数");
		Scanner input=new Scanner(System.in);
		int x=input.nextInt();
		for(int i=0;i<4;i++){
			 sum=sum+a[i];
			 if(x==a[i]){
				 System.out.println("数组包含此数");
			 }
		}
		System.out.println("求和："+sum);
	}
}
