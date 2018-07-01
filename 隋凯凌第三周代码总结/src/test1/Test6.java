//上传文件，验证文件扩展名是否正确是否是.jpg等
package test1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("请输入文件名:");
			String s1 = input.next();
			if (s1.isEmpty()) {
				System.out.println("输入字符串不能为空，请重新输入");
				continue;
			}
			int num = s1.lastIndexOf(".");
			if (num <= 0) {
				System.out.println("不能以.开头，或没有找到.,请重新输入");
				continue;
			}
			String s2 = s1.substring(num);
			if (s2.equals(".jpg") || s2.equals(".gif")) {
				System.out.println("传入成功");
				break;
			} else {
				System.out.println("输入失败，请重新输入");
			}
		}
	}
}
