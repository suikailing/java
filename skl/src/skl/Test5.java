package skl;

public class Test5 {
	public static void main(String[] args) {
		int i=1;
		while(i<=100){
			if((i%10==7)||(i/10==7)||(i%7==0)){
				System.out.println("วร");
			}else{
				System.out.println(i);
			}
			i++;
		}
	}
}

