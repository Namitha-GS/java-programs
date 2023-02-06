package practice_prgm;

import java.util.Scanner;

public class PrimeNosWithRange {
	
	private static boolean isPrime(int n) {
		if(n < 2) {
			return false;
		} else if(n==2) {
			return true;
		} else {
			for(int i=2; i<= (int)Math.sqrt(n); i++) {
				if(n%i == 0)
					return false;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int start = sc.nextInt();
		System.out.println("Enter the ending number:");
		int end = sc.nextInt();
		sc.close();
		if(start<0 || start>end) {
			System.out.println("Invalid range");
		}
		else {
			while(start<=end) {
				if(isPrime(start)) {
					System.out.print(start+" ");
				}
				start++;
			}
		}
	}

}
