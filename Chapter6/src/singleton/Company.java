package singleton;

public class Company {

	private static Company instance = new Company(); // ��ü���� �����ϰ� ���� instance, null �̰ų� ���� �ٲ� �� ����
	
	private Company(){} // Company ����Ʈ���͸� �ܺο��� ȣ������ ���ϰ� ��
	
	public static Company getInstance() { // ��ü�� �������� �ʰ� �޼��带 �θ��� ���� static���� ����
		if(instance == null)
			instance = new Company();
		return instance; // �ܺο��� instance�� ������ �� �� ����
	}
}
