package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) { // ��� ������ ��ȣ�� ������ �����Ǳ� ���� �Ű����� ����
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // take : �°��� �¿��� �� ȣ��Ǵ� �޼���, money�� �Ű������� ����
		this.money += money; // ���� �� ��ŭ �þ����
		passengerCount++; // �°��� �¿��� �� �°��� ���� �þ
	}
	public void showInfo() {
		System.out.println("����" + busNumber + "���� �°���" + passengerCount + "���̰�, ������" + money + "�Դϴ�.");
	}
}
