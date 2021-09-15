package array;

public class Enhanced {

	public static void main(String[] args) {
		
		String[] strArr = {"java", "javascript", "python", "django"};
		
		System.out.println("=====���� for�� ��� String=====");

		for(String s : strArr) { // ���� for��
			System.out.println(s); // java, javascript, python, django
		}

		System.out.println("=====���� for�� ��� int=====");

		int[] arr = {1, 2, 3}; // ���� for��
		for(int num : arr) {
			System.out.println(num); // 1, 2, 3
		}
	} 
}