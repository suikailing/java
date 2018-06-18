//（5）输入班级n个学生才成绩，计算平均分。
package cycle;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入班级人数:");
		int num=input.nextInt();
		System.out.println("请输入学生成绩：");
		int avg=0,sum=0;
		for(int i=1;i<=num;i++){
			int score=input.nextInt();
			sum=sum+score;
		}
		avg=sum/num;
		System.out.println("平均分是："+avg);
	}
}
