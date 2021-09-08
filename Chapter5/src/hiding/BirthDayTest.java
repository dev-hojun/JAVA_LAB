package hiding;

class BirthDay {

	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(month == 2) { // month가 2월 일 때
			if(day < 1 || day > 28) { // day가 1보다 작거나 28보다 크면
				System.out.println("날짜 오류입니다."); // 출력
			}
		} else {			
			this.day = day;
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
}

public class BirthDayTest { // 퍼블릭 클래스는 하나여야 하고 파일명과 동일해야 함
	
	public static void main(String[] args) {
		
		BirthDay day = new BirthDay();

		day.setMonth(2);
		day.setDay(30);
		day.setYear(2021);
		
	}
}