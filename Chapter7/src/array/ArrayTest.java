package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] numbers = new int[] {1, 2, 3}; // 1, 2, 3���� �迭 �ʱ�ȭ

		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]); // 1, 2, 3 ���
		}				
		
		int[] studentIDs = new int[3]; // �ʱ�ȭ ���� �ʰ� ���̸� ����
		
		for(int i = 0; i < studentIDs.length; i++) {
			System.out.println(studentIDs[i]);  // 0, 0, 0 ���
		}
	}

}
