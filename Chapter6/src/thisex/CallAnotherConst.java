package thisex;

class Person {
	
	String name;
	int age;
	
	public Person() {
		this("�̸�����", 1); // this �տ� �ٸ� statement�� �� �� ����
	}
	
	public Person(String name, int age) { // Person�� ���� �� �̸��ϰ� ���̸� �Ķ���ͷ� ����
		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() { // �ڱ� �ڽ��� Ŭ���������� ��ȯ���� ��ƾ� ��
		return this; // �����ϰ� �Ǹ� ���� �ν���Ʈ �ּҰ��� ��Ÿ��
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println(p1.name); // �̸����� ���
		
		System.out.println(p1.returnSelf());
	}

}
