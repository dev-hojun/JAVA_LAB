package binary;

public class OperationEx {

	public static void main(String[] args) {
		// 대입 연산자
		int age = 24;
		System.out.println(age); // 24
		
		// 부호 연산자
		int num  = 10; 
		int num2 = -num;
		System.out.println(num); // 10
		System.out.println(num2); // -10
		
		// num의 값을 음수로 바꾸려면?
		num = -num;
		System.out.println(num); // -10
		
		// 증가 감소 연산자
		int num3 = 10;
		System.out.println(++num3); // 11
		
		// 연산자 위치에 따라 결과가 달라짐 
		int num4 = 10;
		System.out.println(num4++); // 10, 문장이 끝난 다음에 더하라
		System.out.println(num4); // 11
		
		int num5 = 10;
		int i = 2;
		
		// 단락 회로 평가
		boolean value = ((num5 = num5 + 10) < 10) && ((i = i + 2) < 10); // 앞 항의 결과가 거짓이므로 i항의 연산이 실행되지 않음
		System.out.println(value);
		System.out.println(num5);
		System.out.println(i);
	}

}
