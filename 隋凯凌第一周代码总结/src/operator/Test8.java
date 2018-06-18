/*（8）   敲7的游戏：逢7或7的倍数，比如14,17
从控制台任意输入一个数，如果需要敲，就显示“敲”.限制输入的数小于100*/
package operator;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {
		System.out.println("请输入一个两位数：");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if((num%7==0)||(num%10==7)){
			System.out.println("敲");
		}else{
			System.out.println(num);
		}
	}
}
