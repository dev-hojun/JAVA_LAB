package arraylist;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 90);
		
		studentLee.showStudentInfo();
		
		System.out.println("===============");
		
		Student studnetKim = new Student(1002, "Kim");
		studnetKim.addSubject("����", 100);
		studnetKim.addSubject("����", 90);
		studnetKim.addSubject("����", 80);
		
		studnetKim.showStudentInfo();
	}

}
