package staticex;

public class Student {
	
	private static int serialNum = 10000; // ������ �Ǵ� ��, 10000���� ����
	
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++; // ��� �ν���Ʈ���� �����Ǹ鼭 �����ϵ��� 
		studentID = serialNum; // ������ serialNum�� ��� �ν���Ʈ���� �����Ǵ� ���̹Ƿ� studentID�� �־��ش�
	}

	public static int getSerialNum() {
		int i = 10; // ��������, getSeriaNum �޼��尡 ȣ��� �� �����ƴٰ� ������ ������
		
		i++;
		System.out.println(i);
		
		// studentName = "ȫ�浿"; // �ν��Ͻ� ����, �������, ��ȿ�� �� �����Ǵ� ����, static �޼��忡�� �ν��Ͻ� ������ ����� �� ����
		
		return serialNum; // static ����, Ŭ���� ����
	}
	
}
