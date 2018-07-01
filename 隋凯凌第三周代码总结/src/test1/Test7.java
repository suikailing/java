//ÊäÈëÒ»¸ö×Ö·û´®£¬µ¹ÐðÊä³ö¡£
package test1;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		String s1 = input.next();
		for (int i = s1.length() - 1; i >= 0; i--) {
			char s2 = s1.charAt(i);
			System.out.print(s2 + "\t");
		}
	}
}
