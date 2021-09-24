package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 90);
		
		studentLee.showStudentInfo();
		
		System.out.println("===============");
		
		Student studnetKim = new Student(1002, "Kim");
		studnetKim.addSubject("국어", 100);
		studnetKim.addSubject("수학", 90);
		studnetKim.addSubject("영어", 80);
		
		studnetKim.showStudentInfo();
	}

}
