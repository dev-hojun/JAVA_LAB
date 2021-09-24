package arraylist;

public class Subject {
	
	private String name; // 과목 이름 선언
	private int scorePoint; // 과목 점수 선언
	
	public String getName() { // private로 선언했기 때문에 get, set 선언
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
	
	
}
