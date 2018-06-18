//£¨1£©ÇÃ7ÓÎÏ·£¬100ÒÔÄÚ¡£
package cycle;

public class Test1 {
	public static void main(String[] args) {
		for(int i=1;i<100;i++){
			if((i%7==0)||(i/10==7)||(i%10==7)){
				System.out.println("ÇÃ");
			}else{
				System.out.println(i);
			}
		}
	}
}
