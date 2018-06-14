package shuzhu;
import java.util.Scanner;
public class Maopao {
	public static void main(String[] args) {
		System.out.println("请输入2个数：");
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		int num2=input.nextInt();
		int rew=0;
		System.out.println("请选择要进行的计算：1：加法。2：减法。3：乘法。4：除法。");
		int num3=input.nextInt();
		if(num3==1){
			rew=num1+num2;
		}else if(num3==2){
		    rew=num1-num2;
		}else if(num3==3){
			rew=num1*num2;
		}else if(num3==4){
			rew=num1/num2;
		}else{
            System.out.println("输入错误");
            System.exit(0);
		}
        System.out.println(rew);
	}
}

