package binary;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10; // 1바이트
		int num = bNum; // 4바이트
		
		System.out.println(num); // 값이 잘 들어감
		
		long lNum = 10; // 8바이트
		float fNum = lNum; // 4바이트
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // 두 번의 형 변환, fNum(실수) num(정수), num이 자연형으로 형 변환, 그 뒤 더블로 형 변환
		System.out.println(dNum);
	}

}
