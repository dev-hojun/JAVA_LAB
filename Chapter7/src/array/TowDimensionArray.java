package array;

public class TowDimensionArray {

	public static void main(String[] args) {

		int[][] arr = {{1, 2, 3}, {4, 5, 6}}; // 선언과 초기화
		
		System.out.println(arr.length); // 전체 행의 길이, 2
		System.out.println(arr[0].length); // 0행의 열, 3
		System.out.println(arr[1].length); // 1행의 열, 3
		
		System.out.println("=====for문 출력=====");
		
		for(int i = 0; i < arr.length; i++) { // i가 행이 되어 [0], [1]이 되고
			for(int j = 0; j < arr[i].length; j++) { // j는 열이 되어 [0], [1], [2] 
				System.out.println(arr[i][j]); // [0][0], [0][1], [0][2], [1][0]...
			}
		}
	}
}
