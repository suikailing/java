//创建学校类，并且调用学校类
package test2;

public class School {
	String SchoolName;
	String SchoolClass;
	int SchoolPeople;

	public void sui() {
		System.out.println("学校名字是：" + SchoolName);
		System.out.println("学校正在上" + SchoolClass + "课");
	}

	public void kai() {
		System.out.println(SchoolName + "学校共有" + SchoolPeople + "人");
	}
}
