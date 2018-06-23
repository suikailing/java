/*写一个music类，写好属性和方法，写一个mp3类，
      调用music的属性和方法，最后些主函数，调用mp3类的属性和方法。
*/package test3;

public class MainClass {
	public static void main(String[] args) {
		Mp3Class suikailing = new Mp3Class();
		suikailing.Mp3Name = "牛牛";
		suikailing.Mp3Model = "无敌型号";
		suikailing.Mp3Production = 2018;
		suikailing.ling();
	}
}
