package practice_prgm;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	private static int factorial(int n) {
		if(n==0)
			return 1;
		else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		int num = sc.nextInt();
		sc.close();
		
		int fact = factorial(num);
		System.out.println("Factorial: "+fact);
	}

}
