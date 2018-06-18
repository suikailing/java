//（7）水仙花数12321，即个位=万位，十位=千位，
//    从控制台输入任意一个五位数，判断是否是水仙花数。
package operator;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		System.out.println("请输入一个五位数:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int wanwei=num/10000;
		int qianwei=num/1000%10;
		int shiwei=num/10%10;
		int gewei=num%10;
		if((wanwei==gewei)&&(shiwei==qianwei)){
			System.out.println(num+"是一个水仙花数。");
		}else{
			System.out.println(num+"不是一个水仙花数。");
		}
	}
}
