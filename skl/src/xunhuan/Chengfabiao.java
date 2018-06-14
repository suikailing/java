package xunhuan;

public class Chengfabiao {
	public static void main(String[] args) {
		int i=1,j=1,x;
		for(i=1;i<=9;i++){
			for(j=1;j<=i;j++){
				x=i*j;
				System.out.print(i+"*"+j+"="+x+"\t");
			}
			System.out.println();
		}
	}
}
