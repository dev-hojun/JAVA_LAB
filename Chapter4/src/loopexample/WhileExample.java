package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0; // �ʱ�ȭ�� �� ��� ������ �� ��
		
		do { // �� �ȿ� ������ ������ �� ���� �����
			sum += num;
			num++;
		} while(num <= 10);
		
		System.out.println("1���� 10������ ���� " + sum + "�Դϴ�.");
	}
}
