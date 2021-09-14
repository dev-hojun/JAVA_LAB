package singleton;

public class Company {

	private static Company instance = new Company(); // 전체에서 유일하게 사용될 instance, null 이거나 값이 바뀔 수 없음
	
	private Company(){} // Company 컨스트럭터를 외부에서 호출하지 못하게 함
	
	public static Company getInstance() { // 객체를 생성하지 않고 메서드를 부르기 위해 static으로 선언
		if(instance == null)
			instance = new Company();
		return instance; // 외부에서 instance를 가져다 쓸 수 있음
	}
}
