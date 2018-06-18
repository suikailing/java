//（1）练习：输入2个数字，做一个计算器，实现加减乘除。
package judge;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int num1=input.nextInt();
		System.out.println("请输入第二个数:");
		int num2=input.nextInt();
		System.out.println("请输入要进行的运算：1.+,2.-,3.*,4./:");
		int yunsuan=input.nextInt();
		int calculate=0;
		if(yunsuan==1){
			calculate=num1+num2;
		}else if(yunsuan==2){
			calculate=num1-num2;
		}else if(yunsuan==3){
			calculate=num1*num2;
		}else if(yunsuan==4){
			calculate=num1/num2;
		}
		System.out.println(calculate);
	}
}
