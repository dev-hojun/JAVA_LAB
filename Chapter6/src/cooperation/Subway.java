package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) { // take : �°��� �¿��� �� ȣ��Ǵ� �޼���, money�� �Ű������� ����
		this.money += money; // ���� �� ��ŭ �þ����
		passengerCount++; // �°��� �¿��� �� �°��� ���� �þ
	}
	public void showInfo() {
		System.out.println("����ö" + lineNumber + "���� �°���" + passengerCount + "���̰�, ������" + money + "�Դϴ�.");
	}
}
