package classpart;

public class Student {
	
	int studentID; // ����
	String studentName; // �̸��� ���ڱ� ������ ���ڿ��� ����ϱ� ���� string Ŭ���� ���
	int grade; // ����
	String address; // ���ڿ�
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // <- �޼���
	}
	
}
