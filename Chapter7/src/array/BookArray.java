package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5]; // Book�� 5�� �����Ǵ� ���� �ƴ� Book�� �� �ּ� �ڸ��� 5�� ������
		
		library[0] = new Book("�����", "�������丮");
		library[1] = new Book("����", "�ڰ渮");
		library[2] = new Book("Į�� �뷡", "����");
		library[3] = new Book("������ �ٲٴ� ������", "��ī�� ��");
		library[4] = new Book("���� �ؼ�", "������Ʈ");

		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // ���� null 5���� ���
		}		
	}
}