package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		
		int age = 9;
		int charge = 0; // �ʱ�ȭ
		
		if(age < 8) {
			charge = 600;
			System.out.println("������ �Ƶ��Դϴ�.");
		} else if(age < 14) {
			charge = 800;
			System.out.println("�ʵ��л��Դϴ�.");
		} else if(age < 20) {
			charge = 1000;
			System.out.println("��, ����л��Դϴ�.");
		} else {
			charge = 1200;
			System.out.println("�����Դϴ�.");
		}
		System.out.println("������ " + charge + "���Դϴ�."); // age�� 9�̹Ƿ� "������ 800���Դϴ�" ���
	}

}
