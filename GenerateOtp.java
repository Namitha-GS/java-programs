package practice_prgm;

import java.util.SplittableRandom;

public class GenerateOtp {
	
	private static String generateOtp(int otpLength) {
		SplittableRandom splittableRandom = new SplittableRandom();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<otpLength; i++) {
			sb.append(splittableRandom.nextInt(0, 10));
		}
		
		return sb.toString();

	}

	public static void main(String[] args) {
		System.out.println(generateOtp(4));
	}

}
