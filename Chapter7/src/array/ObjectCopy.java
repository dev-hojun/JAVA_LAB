package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("Į�� �뷡1", "����"); // bookArray1�� �ν��Ͻ��� ������ ���� ����
		bookArray1[1] = new Book("Į�� �뷡2", "����");
		bookArray1[2] = new Book("Į�� �뷡3", "����");
		
		bookArray2[0] = new Book(); // bookArray2�� �ɹ������� ä������ ���� ���� 
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray1.length; i++) {
				bookArray2[i].setAuthor(bookArray1[i].getAuthor()); // arraycopy�� ������� �ʰ� ���� ������ ������
				bookArray2[i].setBookName(bookArray1[i].getBookName()); // arraycopy�� ������� �ʰ� ���� ������ ������
		}
		
		bookArray1[0].setBookName("�����");
		bookArray1[0].setAuthor("�������丮");
		
		System.out.println("=====bookrArray1�� �����=====");
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo(); // bookArray1�� 0�� �ε����� ����� ���ڰ� ������
		}
		
		System.out.println("=====bookArray2�� �����=====");
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo(); // ������ �������� ���� bookArray2�� 0�� �ε����� ���� ������
		}
	}
}
