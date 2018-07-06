/*从控制台输入学生的学号，姓名，成绩信息，用链表Linkedlist存储学生的信息，
并且输入的学号不能相同，相同则重新输入，输入0退出录入学生信息，跳转到查询学
生信息界面，输入学号，显示学生的其他信息，循环输入学号查询，当输入学号为0时
退出系统，当输入学号为1时，跳转到修改学生信息界面，根据提供的学号，修改学生
的姓名和成绩，修改完成后，跳回查询信息界面，查询修改后的学生信息。*/
package test2;

public class Test1 {
	private String stuid;
	private String stuname;
	private String stuscore;
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStuscore() {
		return stuscore;
	}
	public void setStuscore(String stuscore) {
		this.stuscore = stuscore;
	}
	public Test1(String stuid, String stuname, String stuscore) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stuscore = stuscore;
	}
	
}
