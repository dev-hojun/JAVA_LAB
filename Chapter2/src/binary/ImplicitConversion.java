package binary;

public class ImplicitConversion {

	public static void main(String[] args) {
		byte bNum = 10; // 1����Ʈ
		int num = bNum; // 4����Ʈ
		
		System.out.println(num); // ���� �� ��
		
		long lNum = 10; // 8����Ʈ
		float fNum = lNum; // 4����Ʈ
		
		System.out.println(fNum);
		
		double dNum = fNum + num; // �� ���� �� ��ȯ, fNum(�Ǽ�) num(����), num�� �ڿ������� �� ��ȯ, �� �� ����� �� ��ȯ
		System.out.println(dNum);
	}

}
