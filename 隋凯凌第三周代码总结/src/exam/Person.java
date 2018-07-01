package exam;

public class Person {

	private String personName;
	private double personHeight;
	private int personWeight;

	public Person(String personName, double personHeight, int personWeight) {
		this.personName = personName;
		this.personHeight = personHeight;
		this.personWeight = personWeight;
	}

	public void sayHello() {
		System.out.println("我的名字是:" + personName + "\t我的身高是:" + personHeight + "\t我的体重是:" + personWeight);
	}

	public static void main(String[] args) {
		Person skl = new Person("zhangsan", 1.73, 33);
		Person skl2 = new Person("lisi", 1.74, 44);
		skl.sayHello();
		skl2.sayHello();
	}
}
