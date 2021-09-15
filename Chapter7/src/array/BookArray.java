package array;

public class BookArray {

	public static void main(String[] args) {

		Book[] library = new Book[5]; // Book이 5개 생성되는 것이 아닌 Book이 들어간 주소 자리가 5개 생성됨
		
		library[0] = new Book("어린왕자", "생택쥐페리");
		library[1] = new Book("토지", "박경리");
		library[2] = new Book("칼의 노래", "김훈");
		library[3] = new Book("생각을 바꾸는 생각들", "비카스 샤");
		library[4] = new Book("꿈의 해석", "프로이트");

		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]); // 따라서 null 5개가 출력
		}		
	}
}