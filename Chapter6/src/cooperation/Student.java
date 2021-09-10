package cooperation;

public class Student { 
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) { // Student를 생성할 때 학생의 이름과 돈을 매개변수로 받겠다
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) { // 버스에 대한 정보를 매개변수로 받겠다
		bus.take(1000); // Student라는 클래스에서 Bus 클래스를 호출
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) { // 지하철에 대한 정보를 매개변수로 받겠다
		subway.take(1500); 
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은" + money + "입니다.");
	}
}
