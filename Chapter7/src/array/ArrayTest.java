package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] numbers = new int[] {1, 2, 3}; // 1, 2, 3으로 배열 초기화

		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]); // 1, 2, 3 출력
		}				
		
		int[] studentIDs = new int[3]; // 초기화 하지 않고 길이만 선언
		
		for(int i = 0; i < studentIDs.length; i++) {
			System.out.println(studentIDs[i]);  // 0, 0, 0 출력
		}
	}

}
