package binary;

public class OperationEx2 {

	public static void main(String[] args) {
		// 복합 대입 연산자
		int num1 = 10;
		System.out.println(num1 += 1);
		System.out.println(num1 -= 1);
		System.out.println(num1 *= 1);
		System.out.println(num1 /= 1);
		System.out.println(num1 %= 1);
		
		// 조건 연산자
		int num = (3 > 2) ? 10 : 20;
		System.out.println(num);
		
	}

}
