package array;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean[] primeNum = new boolean[101];
		primeNum[1] = true;
		
		for(int i=2; i<=50; i++) {
			for(int j=2; i*j<=51; j++) {
				primeNum[i*j] = true;
			}
		}
	
		for(int i=1; i<=50; i++) {
			if(!primeNum[i]) System.out.println(i);
		}
	}
}
