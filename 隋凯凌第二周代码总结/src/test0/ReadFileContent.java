package test0;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileContent {

	public void sui(String name) throws FileNotFoundException {
		Object suikailing;
		Scanner input = new Scanner(new File("E:/" + name));
		while (input.hasNextLine()) {
			System.out.println(input.nextLine());
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		ReadFileContent skl = new ReadFileContent();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入文件名字");
		String name = input.next();
		skl.sui(name);
	}
}
