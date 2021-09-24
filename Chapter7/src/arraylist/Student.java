package arraylist;

import java.util.ArrayList; // ����Ű : Ctrl + Shift + O 

public class Student {

	private int studentID; // �л� �й� ����
	private String studentName; // �л� �̸� ����
	private ArrayList<Subject> subjectList; // �л��� ���� ���� ������ �迭�� ����
	
	public Student(int studentID, String studentName) { // Student�� ������ �� studentID, studentName�� ������
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); // Student�� �����Ǹ� �迭�� �����Ǳ� ����
	}
	
	public void addSubject(String name, int score) { // �л��� ������ �����ϸ� subjectList�� �߰��ǵ��� �ϰ� � ���� ���ؼ� �� ���̴ٶ�� ���� addSubject�� ���� �߰��ǵ��� ��
		
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() { // �л� ������ ������ �޼���
		
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
		}
		
		for(Subject subject : subjectList) {
			System.out.println("�л�" + studentName + "����" + subject.getName() + " ������ ������ " + subject.getScorePoint() + "���Դϴ�.");
		}
		
		System.out.println("�л�" + studentName + "���� ������ " + total + "���Դϴ�.");
	}
}
