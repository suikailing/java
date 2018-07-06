//从控制台输入若干个单词（输入回车结束）放入集合中，将这些单词排序后（忽略大小写）打印出来。
package exam;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		LinkedList<String> skl=new LinkedList<String>();
		Scanner input=new Scanner(System.in);
		while(true){
			System.out.println("请输入单词(输入回车结束)");
			String s1=input.next();
			if(s1.equals("回车")){
				break;
			}
			skl.add(s1);
		}
		String a[]=new String[skl.size()];
		int i=0;
		for(String s1:skl){
			a[i]=s1;
			i++;
		}
		Arrays.sort(a);
		for(int x=0;x<a.length;x++){
			System.out.println(a[x]);
		}
		
		
	}
}
