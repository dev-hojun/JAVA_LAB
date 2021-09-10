package cooperation;

public class Student { 
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) { // Student�� ������ �� �л��� �̸��� ���� �Ű������� �ްڴ�
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // ������ ���� ������ �Ű������� �ްڴ�
		bus.take(1000); // Student��� Ŭ�������� Bus Ŭ������ ȣ��
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) { // ����ö�� ���� ������ �Ű������� �ްڴ�
		subway.take(1500); 
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ����" + money + "�Դϴ�.");
	}
}
