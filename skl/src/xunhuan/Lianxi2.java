package xunhuan;

public class Lianxi2 {
	public static void main(String[] args) {
		double num=80000;
		int i=1;
		for(;i<100;i++){
			num=num*1.25;
			if(num>=200000){
				break;
			}
		}
		System.out.println(2012+i);
	}
}
