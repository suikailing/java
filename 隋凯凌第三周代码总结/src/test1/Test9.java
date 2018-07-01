/*编写一个类Book2，代表教材：
具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，
否则输出错误信息，并赋予默认值200具有方法： detail，用来在控制台输
出每本教材的名称和页数。具有带参数的构造方法：用来完成对象的初始化工
作，并在构造方法中完成对页数的最小值限制编写测试类Book2Test进行测
试：初始化一个Book2对象，并调用该Book2对象的detail方法，看看输
出是否正确*/
package test1;

public class Test9 {
	private String bookName;
	private int bookPageNum;

	public Test9(String bookName, int bookPageNum) {
		this.bookName = bookName;
		this.bookPageNum = bookPageNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPageNum() {
		return bookPageNum;
	}

	public void setBookPageNum(int bookPageNum) {
		if (bookPageNum < 200) {
			bookPageNum = 200;
		}
		this.bookPageNum = bookPageNum;
	}

	public void detail() {
		System.out.println("书名字:" + bookName + "\t书页数:" + bookPageNum);
	}

	public static void main(String[] args) {
		Test9 skl = new Test9("肚肚", 234);
		skl.detail();
	}

}
