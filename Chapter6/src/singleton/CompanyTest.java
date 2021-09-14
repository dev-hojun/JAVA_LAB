package singleton;

public class CompanyTest {

	public static void main(String[] args) {

		Company c1 = Company.getInstance(); // instance메서드를 가져옴
		
		Company c2 = Company.getInstance();
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
