package exam;

public class Rectangle {

	private int length;
	private int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getArea() {
		return length * width;
	}

	public int getPor() {
		return 2 * (length + width);
	}

	public void showAll() {
		System.out.println("矩形的长是:" + length + "\t矩形的宽为:" + width);
		System.out.println("矩形的面积是:" + getArea() + "\t矩形的周长为:" + getPor());
	}

	public static void main(String[] args) {
		Rectangle skl = new Rectangle(30, 40);
		skl.showAll();
	}
}
