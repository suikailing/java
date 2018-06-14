package xunhuan;

public class Add {
	public static void main(String[] args) {
		int i=1,sum1=0,sum2=0,sum3=0;
		for(int q=0;q<=100;q++){
			if(q%2!=0){
				sum3=sum3+q;				
			}
		}
		System.out.println("sum3="+sum3);
		for(;i<=30;i++){
			if((i%10==7)||(i%7==0)){
				System.out.println("วร");
			}else{
				System.out.println(i);
			}
		}
		int j=1;
		double x=4500;
		do{
			x=x*1.3;
			j++;
		}while(j<=5);
		System.out.println(x);
	}
}
