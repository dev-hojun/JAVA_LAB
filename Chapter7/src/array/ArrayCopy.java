package array;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {1, 2, 3, 4, 5};
		int[] array2 = {10, 20, 30, 40, 50};
		
		System.arraycopy(array1, 0, array2, 1, 3);
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]); // 10, 1, 2, 3, 50 ���
		}
	} 
}
// array1 : ������ �迭
// 0 : ������ ù ��° ��ġ
// array2 : ������ ��� �迭
// 1 : �ٿ����� ù ��° ��ġ
// 3 : ������ ��� ����