/*从控制台输入学生的学号，姓名，成绩信息，用链表Linkedlist存储学生的信息，
并且输入的学号不能相同，相同则重新输入，输入0退出录入学生信息，跳转到查询学
生信息界面，输入学号，显示学生的其他信息，循环输入学号查询，当输入学号为0时
退出系统，当输入学号为1时，跳转到修改学生信息界面，根据提供的学号，修改学生
的姓名和成绩，修改完成后，跳回查询信息界面，查询修改后的学生信息。*/
package test2;

import java.util.LinkedList;
import java.util.Scanner;

public class Test2 {
	LinkedList<Test1> skl=new LinkedList<Test1>();
	Scanner input=new Scanner(System.in);
	public void sui(){
		while(true){
			boolean ret=false;
			System.out.println("请输入学号(0退出)");
			String s1=input.next();
			if(s1.equals("0")){
				break;
			}
			if(s1.isEmpty()){
				System.out.println("不能为空");
				continue;
			}
			for(Test1 dudu:skl){
				if(s1.equals(dudu.getStuid())){
					System.out.println("学号重复，重新输入");
					ret=true;
					break;
				}
			}
			if(ret==false){
				System.out.println("请输入姓名");
				String s2=input.next();
				System.out.println("请输入成绩");
				String s3=input.next();
				Test1 lala=new Test1(s1, s2, s3);
				skl.add(lala);
			}
			
		}
	}
	
	public void kai(){
		while(true){
			boolean ret=false;
			System.out.println("请输入要查询的学号(0修改输入退出)");
			String s1=input.next();
			if(s1.equals("0")){
				this.ling();
				break;
			}
			if(s1.equals("退出")){
			System.exit(0);
			}
			for(Test1 dudu:skl){
				if(dudu.getStuid().equals(s1)){
					System.out.println(dudu.getStuid()+"\t"+dudu.getStuname()+"\t"+dudu.getStuscore());
					ret=true;
					break;
				}
			}
			if(ret==false){
				System.out.println("未找到这个学号，重新输入");
				continue;
			}
		}
	}	
	public void ling(){
		while(true){
			boolean ret=false;
			System.out.println("请输入要修改的学号(0查询,输入删除)");
			String s1=input.next();
			if(s1.equals("0")){
				this.kai();
				break;
			}
			if(s1.equals("删除")){
				this.suikailing();
				break;
			}
			for(Test1 dudu:skl){
				if(s1.equals(dudu.getStuid())){
					System.out.println("请输入修改的姓名");
					String s2=input.next();
					System.out.println("请输入修改的成绩");
					String s3=input.next();
					dudu.setStuname(s2);
					dudu.setStuscore(s3);
					ret=true;
				}
			}
			if(ret==false){
				System.out.println("未找到这个学号，重新输入");
				continue;
			}
		}
	}
	public void suikailing(){
		while(true){
			boolean ret=false;
			System.out.println("请输入要删除的元素(0查询)");
			String s1=input.next();
			if(s1.equals("0")){
				this.kai();
			}
			for(Test1 dudu:skl){
				if(s1.equals(dudu.getStuid())){
					skl.remove(dudu);
					System.out.println("已经删除");
					ret=true;
					break;
				}
			}
			if(ret==false){
				System.out.println("未找到这个学号，重新输入");
				continue;
			}
		}
	}
	public static void main(String[] args) {
		Test2 uio=new Test2();
		uio.sui();
		uio.kai();
	}
}
