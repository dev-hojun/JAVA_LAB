package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {10, 20, 30, 40, 50};
		
		System.arraycopy(array1, 0, array2, 1, 3);
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]); // 10, 1, 2, 3, 50 출력
		}
	} 
}
// array1 : 복사할 배열
// 0 : 복사할 첫 번째 위치
// array2 : 복사할 대상 배열
// 1 : 붙여넣을 첫 번째 위치
// 3 : 복사할 요소 갯수