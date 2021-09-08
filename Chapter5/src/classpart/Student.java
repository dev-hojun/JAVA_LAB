package classpart;

public class Student {
	
	int studentID; // 정수
	String studentName; // 이름은 문자기 때문에 문자열을 사용하기 위해 string 클래스 사용
	int grade; // 정수
	String address; // 문자열
	
	public Student() {} // 디폴트 생성자
	
	public Student(int id, String name) { // Student가 생성될 때 두 개의 매개변수를 전달받는 생성자
		studentID = id;
		studentName = name;
	}
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + address); // <- 메서드
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	 
	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentID = 100;
		studentLee.address = "서울시 영등포구 여의도동";
		
		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 산호세";
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
	}
}
