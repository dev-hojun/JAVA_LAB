package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum; // 명시적으로 써 줘야 함
		
		System.out.println(iNum);
		System.out.println(bNum); // 큰 수에서 작은 수로 넘기면 데이터 유실될 수 있음
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; // dNum(3.14 -> 3) + fNum(0.9 -> 0) = 3
		int num2 = (int)(dNum + fNum); // 3.14 + 0.9 = 4.23을 int로 바꾸니 4로 됨
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
