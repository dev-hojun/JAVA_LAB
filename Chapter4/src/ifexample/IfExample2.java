package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		
		int age = 9;
		int charge = 0; // 초기화
		
		if(age < 8) {
			charge = 600;
			System.out.println("미취학 아동입니다.");
		} else if(age < 14) {
			charge = 800;
			System.out.println("초등학생입니다.");
		} else if(age < 20) {
			charge = 1000;
			System.out.println("중, 고등학생입니다.");
		} else {
			charge = 1200;
			System.out.println("성인입니다.");
		}
		System.out.println("입장료는 " + charge + "원입니다."); // age는 9이므로 "입장료는 800원입니다" 출력
	}

}
