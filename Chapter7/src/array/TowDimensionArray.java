package array;

public class TowDimensionArray {

	public static void main(String[] args) {

		int[][] arr = {{1, 2, 3}, {4, 5, 6}}; // ����� �ʱ�ȭ
		
		System.out.println(arr.length); // ��ü ���� ����, 2
		System.out.println(arr[0].length); // 0���� ��, 3
		System.out.println(arr[1].length); // 1���� ��, 3
		
		System.out.println("=====for�� ���=====");
		
		for(int i = 0; i < arr.length; i++) { // i�� ���� �Ǿ� [0], [1]�� �ǰ�
			for(int j = 0; j < arr[i].length; j++) { // j�� ���� �Ǿ� [0], [1], [2] 
				System.out.println(arr[i][j]); // [0][0], [0][1], [0][2], [1][0]...
			}
		}
	}
}
