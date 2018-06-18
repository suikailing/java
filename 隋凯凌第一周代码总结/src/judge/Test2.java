//（2）输入分数，显示等级，90~100，成绩优。
//    70~89成绩良。60~70成绩及格。0~59成绩不及格。
package judge;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入成绩；");
		int score=input.nextInt();
		if((score>100)||(score<0)){
			System.out.println("输入错误，请重新输入");
			System.exit(0);
		}
		if(score>=90){
			System.out.println("成绩优");
		}else if(score>=70){
			System.out.println("成绩良");
		}else if(score>=60){
			System.out.println("成绩及格");
		}else{
			System.out.println("成绩不及格");
		}
	}
}
