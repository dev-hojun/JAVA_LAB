package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
					break; // break�� ������ ������ �����ϴ���� ���������� ���ϰ� ���� case�� ����
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default : medalColor = 'A';
		}
		System.out.println(rank + "�� �޴��� ������ " + medalColor + "�Դϴ�.");
	}
}
