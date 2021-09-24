package arraylist;

import java.util.ArrayList; // 단축키 : Ctrl + Shift + O 

public class Student {

	private int studentID; // 학생 학번 선언
	private String studentName; // 학생 이름 선언
	private ArrayList<Subject> subjectList; // 학생이 배우는 여러 과목을 배열로 관리
	
	public Student(int studentID, String studentName) { // Student가 생성될 때 studentID, studentName을 가져옴
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList = new ArrayList<Subject>(); // Student가 생성되면 배열이 생성되기 위해
	}
	
	public void addSubject(String name, int score) { // 학생이 과목을 수강하면 subjectList에 추가되도록 하고 어떤 과목에 대해서 몇 점이다라는 것이 addSubject에 의해 추가되도록 함
		
		Subject subject = new Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}
	
	public void showStudentInfo() { // 학생 정보를 보여줄 메서드
		
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
		}
		
		for(Subject subject : subjectList) {
			System.out.println("학생" + studentName + "님의" + subject.getName() + " 과목의 성적은 " + subject.getScorePoint() + "점입니다.");
		}
		
		System.out.println("학생" + studentName + "님의 총점은 " + total + "점입니다.");
	}
}
