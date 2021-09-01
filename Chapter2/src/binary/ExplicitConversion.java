package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum; // ��������� �� ��� ��
		
		System.out.println(iNum);
		System.out.println(bNum); // ū ������ ���� ���� �ѱ�� ������ ���ǵ� �� ����
		
		double dNum = 3.14;
		iNum = (int)dNum;
		System.out.println(iNum);
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; // dNum(3.14 -> 3) + fNum(0.9 -> 0) = 3
		int num2 = (int)(dNum + fNum); // 3.14 + 0.9 = 4.23�� int�� �ٲٴ� 4�� ��
		
		System.out.println(num1);
		System.out.println(num2);
		
	}

}
