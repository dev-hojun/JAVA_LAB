package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5]; // ���̴� 5������ 0, 1, 2�� ���� �� ����
		int size = 0; // ��ȿ�� ������ ������ ����� ���
		
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
		
		double total = 1;

		for(int i = 0; i < size; i++) { // size ��� length�� �ϸ� ��ü �迭�� ���̰� 0�̱� ������ 0�� ����
			System.out.println(num[i]);
			total *= num[i]; // size�� ���س��� �ʰ� ���� ���ϰ� �Ǹ� num[4], [5] ���� 0���� �Ҵ�Ǿ� ���� ���� 0�� ��
		}
		System.out.println("total = " + total);
	}

}
