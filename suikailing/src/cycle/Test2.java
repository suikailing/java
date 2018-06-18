//£®2£©√∞≈›À„∑®£¨≈≈–Ú°£
package cycle;

public class Test2 {
	public static void main(String[] args) {
		int a[]={32,65,34,87,15,45};
		int y=0;
		for(int i=0;i<=5;i++){
			for(int j=0;j<i;j++){
				if(a[j]>a[i]){
					y=a[i];
					a[i]=a[j];
					a[j]=y;
				}
			}
		}
		for(int x=0;x<=5;x++){
			System.out.println(a[x]);
		}
	}
}
