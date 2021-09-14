package staticex;

public class Student {
	
	private static int serialNum = 10000; // 기준이 되는 값, 10000부터 시작
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++; // 모든 인스턴트에서 공유되면서 증가하도록 
		studentID = serialNum; // 증가된 serialNum은 모든 인스턴트에서 공유되는 값이므로 studentID에 넣어준다
	}

	public static int getSerialNum() {
		int i = 10; // 지역변수, getSeriaNum 메서드가 호출될 때 생성됐다가 끝나면 없어짐
		
		i++;
		System.out.println(i);
		
		// studentName = "홍길동"; // 인스턴스 변수, 멤버변수, 유효될 때 생성되는 변수, static 메서드에서 인스턴스 변수를 사용할 수 없음
		
		return serialNum; // static 변수, 클래스 변수
	}
	
}
