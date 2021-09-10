package thisex;

class Person {
	
	String name;
	int age;
	
	public Person() {
		this("이름없음", 1); // this 앞에 다른 statement가 올 수 없음
	}
	
	public Person(String name, int age) { // Person을 만들 때 이름하고 나이를 파라미터로 받음
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() { // 자기 자신의 클래스명으로 반환형을 잡아야 함
		return this; // 리턴하게 되면 현재 인스턴트 주소값을 나타냄
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name); // 이름없음 출력
		
		System.out.println(p1.returnSelf());
	}

}
