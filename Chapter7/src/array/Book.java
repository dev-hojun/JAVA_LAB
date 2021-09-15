package array;

public class Book {
	private String bookName;
	private String author;
	
	public Book() {} // default ����Ʈ����
	public Book(String bookName, String author) { // å �̸��� ���ڸ� �Ű������� �޴� ����Ʈ����
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() { // ���� ������ private�� ����ϱ� ���� get �޼���
		return bookName;
	}
	public void setBookName(String bookName) { // ���� ������ private�� ����ϱ� ���� set �޼���
		this.bookName = bookName;
	}
	public String getAuthor() { // ���� ������ private�� ����ϱ� ���� get �޼���
		return author;
	}
	public void setAuthor(String author) { // ���� ������ private�� ����ϱ� ���� set �޼���
		this.author = author;
	}
	
	public void showBookInfo() { // ������ �����ֱ� ���� �޼���
		System.out.println(bookName + ", " + author);
	}
	
}
