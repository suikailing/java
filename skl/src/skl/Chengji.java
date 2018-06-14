package skl;

import java.util.Scanner;

public class Chengji {
	public static void main(String[] args) {
		System.out.println("请输入考生成绩：");
		Scanner input=new Scanner(System.in);
		int score=input.nextInt();
		if((score>100)||(score<0)){
			System.out.println("成绩最高100分，请重新输入！");
			System.exit(0);
		}
		if(score>=90){
			System.out.println("考生成绩优！");
		}else if(score>=70){
			System.out.println("考生成绩良！");
		}else if(score>=60){
			System.out.println("考生成绩及格！");
		}else{
			System.out.println("考生成绩不及格");
		}
	}
}
