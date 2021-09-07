package classpart;

public class Student {
	
	int studentID; // 정수
	String studentName; // 이름은 문자기 때문에 문자열을 사용하기 위해 string 클래스 사용
	int grade; // 정수
	String address; // 문자열
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // <- 메서드
	}
	
}
