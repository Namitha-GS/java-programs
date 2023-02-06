package practice_prgm;

import java.util.Scanner;

public class PrimeNumber {
	
	private static boolean isPrime(int n) {
		if(n < 2)
			return false;
		else if(n==2)
			return true;
		else {
			for(int i=2; i<=(int)Math.sqrt(n); i++) {
				if(n%i == 0)
					return false;
			}
			return true;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		if(isPrime(n))
			System.out.println(n+" is a prime number");
		else
			System.out.println(n+" is not a prime number");
	}

}
