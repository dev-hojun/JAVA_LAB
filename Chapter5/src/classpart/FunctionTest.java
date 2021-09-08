package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2); // return에서 반환된 값이 sum으로 들어감
		System.out.println(sum); // 출력
	}

	public static int addNum(int n1, int n2) { // n1, n2는 addNum에서 새로 선언된 변수, 값을 복사해서 받는 역할만 함
		int result = n1 + n2; // 복사한 값을 더한 후
		return result; // 리턴으로 반환
	}
}
