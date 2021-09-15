package array;

public class Enhanced {

	public static void main(String[] args) {
		
		String[] strArr = {"java", "javascript", "python", "django"};
		
		System.out.println("=====향상된 for문 방식 String=====");

		for(String s : strArr) { // 향상된 for문
			System.out.println(s); // java, javascript, python, django
		}

		System.out.println("=====향상된 for문 방식 int=====");

		int[] arr = {1, 2, 3}; // 향상된 for문
		for(int num : arr) {
			System.out.println(num); // 1, 2, 3
		}
	} 
}