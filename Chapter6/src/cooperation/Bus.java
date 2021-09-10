package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int busNumber) { // 모든 버스가 번호를 가지고 생성되기 위해 매개변수 지정
		this.busNumber = busNumber;
	}
	
	public void take(int money) { // take : 승객을 태웠을 때 호출되는 메서드, money를 매개변수로 지정
		this.money += money; // 받은 돈 만큼 늘어나도록
		passengerCount++; // 승객을 태웠을 때 승객의 수가 늘어남
	}
	public void showInfo() {
		System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은" + money + "입니다.");
	}
}
