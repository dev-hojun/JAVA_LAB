package binary;

public class OperationEx3 {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 10;
		
		// ��Ʈ ������
		int result = num1 & num2;
		System.out.println(result); // 0

		int result2 = num1 | num2;
		System.out.println(result2); // 15

		int num3 = 5;
		System.out.println(num3 << 1); // 10, 2�� 1���� ���� ���� ����, num3���� ���������� �ٲ��� ����
		System.out.println(num3 << 2); // 10, 2�� 2���� ���� ���� ����
		System.out.println(num3 << 3); // 10, 2�� 3���� ���� ���� ����
		System.out.println(num3 <<= 1); // ���� ���� �����ڸ� �̿��� num3���� �ٲ� �� ����
		System.out.println(num3);	
	}
}
