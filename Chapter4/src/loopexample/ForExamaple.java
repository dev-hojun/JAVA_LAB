package loopexample;

public class ForExamaple {

	public static void main(String[] args) {
		
		int sum = 0;
		int num = 1;
		
		while(true) { // ��� �ݺ�
			sum += num;
			
			if(sum > 100)
				break; // 100�� ���� ���� ������������
			num++;
		}
		System.out.println(sum);
		System.out.println(num);
	}
}
