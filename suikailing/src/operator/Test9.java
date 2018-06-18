package operator;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年份：");
		int year=input.nextInt();
		System.out.println("请输入月份:");
		int month=input.nextInt();
		int yearday=0,day=0;
		int sumyearday=0,monthday=0;
		for(int i=1990;i<year;i++){
			if(((i%4==0)&&(i%100!=0))||(i%400==0)){
				yearday=366;
			}else{
				yearday=365;
			}
			sumyearday=sumyearday+yearday;//到year年的总天数.
		}
		for(int j=1;j<=month;j++){
			switch(j){
			case 4:
			case 6:
			case 9:
			case 11:
				day=30;
				break;
			case 2:
					if(((year%4==0)&&(year%100!=0))||(year%400==0)){
						day=29;
					}else{
						day=28;
					}
					break;
			default:
				day=31;
				break;				
			}
			monthday=monthday+day;//当年的天数（算上输入月份）该月有day天
		}
		int sum=sumyearday+monthday-day;
		int y=sum%7;
		int num=0;
		System.out.println("一\t二\t三\t四\t五\t六\t七");
		for(int x=1;x<=(day+y);x++){
			if(x<=y){
				System.out.print("\t");
				num++;
			}else{
				if(num<7){
					num++;
					System.out.print((x-y)+"\t");

				}else{
					System.out.println();
					num=0;
					System.out.print((x-y)+"\t");
					num++;
				}
			}
		}
	}
}
