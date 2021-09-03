package binary;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		// 비트 연산자
		int result = num1 & num2;
		System.out.println(result); // 0

		int result2 = num1 | num2;
		System.out.println(result2); // 15

		int num3 = 5;
		System.out.println(num3 << 1); // 10, 2의 1승을 곱한 값과 동일, num3값이 직접적으로 바뀌지 않음
		System.out.println(num3 << 2); // 10, 2의 2승을 곱한 값과 동일
		System.out.println(num3 << 3); // 10, 2의 3승을 곱한 값과 동일
		System.out.println(num3 <<= 1); // 복합 대입 연산자를 이용해 num3값을 바꿀 수 있음
		System.out.println(num3);	
	}
}
