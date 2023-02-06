package practice_prgm;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		int min = 1, max=99999;
		int randomNo = (int)(Math.random() * (max-min+1) + min);
		System.out.println(randomNo);
	}

}
