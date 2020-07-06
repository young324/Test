package p0701;

class Book{
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}
}

public class ToStringEx {

	public static void main(String[] args) {
		Book book = new Book("JAVA","ȫ�浿");
		System.out.println(book);
		
		String str=new String("test");
		System.out.println(str);
		
		
	}

}
