package staticex;

public class StudentTest1 {

	public static void main(String[] args) { 
		
		System.out.println(Student.getSerialNum()); // static������ ����� �� Ŭ���� �̸����� �����ϵ��� ��
		
		Student studentJ = new Student();
		System.out.println(studentJ.getSerialNum()); // studentID �� ���������� �ο��ǵ��� // 10001
	
		
		Student studentT = new Student();
		System.out.println(studentT.studentID); // 10002 
		
		
	}
}
