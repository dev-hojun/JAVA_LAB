package array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {} // default 컨스트럭터
	public Book(String bookName, String author) { // 책 이름과 저자를 매개변수로 받는 컨스트럭터
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() { // 위에 선언한 private를 사용하기 위해 get 메서드
		return bookName;
	}
	public void setBookName(String bookName) { // 위에 선언한 private를 사용하기 위해 set 메서드
		this.bookName = bookName;
	}
	public String getAuthor() { // 위에 선언한 private를 사용하기 위해 get 메서드
		return author;
	}
	public void setAuthor(String author) { // 위에 선언한 private를 사용하기 위해 set 메서드
		this.author = author;
	}
	
	public void showBookInfo() { // 정보를 보여주기 위한 메서드
		System.out.println(bookName + ", " + author);
	}
	
}
