package classpart;

public class FunctionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 30;
		
		int sum = addNum(num1, num2); // return���� ��ȯ�� ���� sum���� ��
		System.out.println(sum); // ���
	}

	public static int addNum(int n1, int n2) { // n1, n2�� addNum���� ���� ����� ����, ���� �����ؼ� �޴� ���Ҹ� ��
		int result = n1 + n2; // ������ ���� ���� ��
		return result; // �������� ��ȯ
	}
}
