package staticex;

public class StudentTest1 {

	public static void main(String[] args) { 
		
		System.out.println(Student.getSerialNum()); // static변수는 사용할 때 클래스 이름으로 참조하도록 함
		
		Student studentJ = new Student();
		System.out.println(studentJ.getSerialNum()); // studentID 가 순차적으로 부여되도록 // 10001
	
		
		Student studentT = new Student();
		System.out.println(studentT.studentID); // 10002 
		
		
	}
}
