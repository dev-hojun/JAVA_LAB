package binary;

public class OperationEx {

	public static void main(String[] args) {
		// ���� ������
		int age = 24;
		System.out.println(age); // 24
		
		// ��ȣ ������
		int num  = 10; 
		int num2 = -num;
		System.out.println(num); // 10
		System.out.println(num2); // -10
		
		// num�� ���� ������ �ٲٷ���?
		num = -num;
		System.out.println(num); // -10
		
		// ���� ���� ������
		int num3 = 10;
		System.out.println(++num3); // 11
		
		// ������ ��ġ�� ���� ����� �޶��� 
		int num4 = 10;
		System.out.println(num4++); // 10, ������ ���� ������ ���϶�
		System.out.println(num4); // 11
		
		int num5 = 10;
		int i = 2;
		
		// �ܶ� ȸ�� ��
		boolean value = ((num5 = num5 + 10) < 10) && ((i = i + 2) < 10); // �� ���� ����� �����̹Ƿ� i���� ������ ������� ����
		System.out.println(value);
		System.out.println(num5);
		System.out.println(i);
	}

}
