package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5]; // 길이는 5이지만 0, 1, 2만 값이 들어간 상태
		int size = 0; // 유효한 갯수를 변수로 만들어 사용
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1;

		for(int i = 0; i < size; i++) { // size 대신 length로 하면 전체 배열의 길이가 0이기 때문에 0이 나옴
			System.out.println(num[i]);
			total *= num[i]; // size를 정해놓지 않고 전부 곱하게 되면 num[4], [5] 값이 0으로 할당되어 곱한 값이 0이 됨
		}
		System.out.println("total = " + total);
	}

}
