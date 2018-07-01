/*（1）定义一个动物类Creature（知识点：对象的创建和使用） 

    1)定义一个方法setSnarl(Cat cat)可以设置动物发出猫的声音
    2)setSnarl(Dog dog)可以设置动物发出狗的声音
    3)定义一个outPut()方法，可以输出动物的声音
（2）要求定义一个猫类Cat，具有猫的声音，将猫类传入动物类Creature的吼叫方法setSnarl(Cat cat)可以设置动物发出猫的声音
（3）要求定义一个狗类Dog，具有狗的声音，将狗类传入动物类Creature的吼叫方法setSnarlDog dog)可以设置动物发出狗的声音
（4）定义一个Sound类，在main方法里调用Creature类的setSnarl()和outPut()方法分别设置动物的声音和输出动物的声音*/
package exam;

public class Sound {
	public static void main(String[] args) {
		Creature sui1 = new Creature();
		Dog sui2 = new Dog();
		Cat sui3 = new Cat();
		sui1.srtSnarl(sui3);
		sui1.outPut();
		sui1.srtSnarl(sui2);
		sui1.outPut();
	}
}
