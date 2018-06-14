package weekendhomework;
public class Maopao {
	public static void main(String[] args) {
		int a[]={99,45,23,87,43,53};
		int i=0,j=0;
		int len=a.length;
		for(i=0;i<len;i++){
			for(j=0;j<i;j++){
				if(a[i]<a[j]){
					int y=a[i];
					a[i]=a[j];
					a[j]=y;
				}
			}
		}
		int x;
		for(x=0;x<6;x++){
			System.out.println(a[x]);		
		}
	}
}
