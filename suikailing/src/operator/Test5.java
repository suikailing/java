//(5)练习：从控制台输入考试成绩，如果不及格挨打
package operator;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		System.out.println("请输入考试成绩：");
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		if(score<60){
			System.out.println("成绩不及格。");
		}else{
			System.out.println("恭喜成绩及格！");
		}
	}
}
