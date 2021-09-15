package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("칼의 노래1", "김훈"); // bookArray1은 인스턴스에 대입해 놓은 상태
		bookArray1[1] = new Book("칼의 노래2", "김훈");
		bookArray1[2] = new Book("칼의 노래3", "김훈");
		
		bookArray2[0] = new Book(); // bookArray2는 맴버변수가 채워지지 않은 상태 
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
		// System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i = 0; i < bookArray1.length; i++) {
				bookArray2[i].setAuthor(bookArray1[i].getAuthor()); // arraycopy를 사용하지 않고 각각 값들을 가져옴
				bookArray2[i].setBookName(bookArray1[i].getBookName()); // arraycopy를 사용하지 않고 각각 값들을 가져옴
		}
		
		bookArray1[0].setBookName("어린왕자");
		bookArray1[0].setAuthor("생택쥐페리");
		
		System.out.println("=====bookrArray1의 결과값=====");
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray1[i].showBookInfo(); // bookArray1의 0번 인덱스의 제목과 저자가 수정됨
		}
		
		System.out.println("=====bookArray2의 결과값=====");
		
		for(int i = 0; i < bookArray1.length; i++) {
			bookArray2[i].showBookInfo(); // 위에서 변경하지 않은 bookArray2의 0번 인덱스도 같이 수정됨
		}
	}
}
