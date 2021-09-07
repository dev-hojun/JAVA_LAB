package loopexample;

public class ForExamaple {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while(true) { // 계속 반복
			sum += num;
			
			if(sum > 100)
				break; // 100을 넘은 순간 빠져나오도록
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
