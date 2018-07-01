//扫描文件，形成一个大的字符串,并且按照文本中的格式显示到输出框中。
package test1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("E:/suikailing.txt"));
		StringBuffer s1 = new StringBuffer();
		while (input.hasNextLine()) {
			s1.append(input.nextLine());
		}
		System.out.println(s1);
	}

}
