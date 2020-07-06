package p0701;

class bk{
	int booknumber;
	String bookTitle;
	
	@Override
	public String toString() {
		return "bk [booknumber=" + booknumber + ", bookTitle=" + bookTitle + "]";
	}

	bk(int booknumber, String bookTitle) {
		this.booknumber=booknumber;
		this.bookTitle=bookTitle;
	}
}

public class ToStringEx2 {
	public static void main(String[] args) {
		bk book1 = new bk(200,"°³¹Ì");
		System.out.println(book1.toString());
	}
}
