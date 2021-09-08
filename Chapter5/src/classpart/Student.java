package classpart;

public class Student {
	
	int studentID; // ����
	String studentName; // �̸��� ���ڱ� ������ ���ڿ��� ����ϱ� ���� string Ŭ���� ���
	int grade; // ����
	String address; // ���ڿ�
	
	public Student() {} // ����Ʈ ������
	
	public Student(int id, String name) { // Student�� ������ �� �� ���� �Ű������� ���޹޴� ������
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // <- �޼���
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	 
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.studentID = 100;
		studentLee.address = "����� �������� ���ǵ���";
		
		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.studentID = 101;
		studentKim.address = "�̱� ��ȣ��";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}
}
