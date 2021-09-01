package binary;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10; // 10진수
		int bNum = 0B1010; // 0B = 2진수를 의미
		int oNum = 012; // 0이 앞에 있으면 8진수를 의미
		int hNum = 0XA; // 0X = 16진수를 의미
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
	}

}
