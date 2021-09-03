package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0; // 초기화를 해 줘야 오류가 안 남
		
		do { // 블럭 안에 조건이 무조건 한 번은 수행됨
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}
}
