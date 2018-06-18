//（6）今年是2018年，城市人口有80000人，城市人口每年以25%的
//     速度增加，那么到哪年城市人口人数达到200000？
package cycle;

public class Test6 {
	public static void main(String[] args) {
		double people=80000;
		int  i=0;
		for(;people<=200000;){
			i++;
			people=people*1.25;
		}
		System.out.println("需要到"+(2018+i)+"年.");
	}
}
