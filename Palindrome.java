package practice_prgm;

import java.util.Scanner;

public class Palindrome {
	
	private static boolean isPalindrome(int num) {
		String str = String.valueOf(num);
		int size = str.length();
		for(int i=0; i<size/2; i++) {
			if(str.charAt(i) != str.charAt(size-i-1))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome:");
		int num = sc.nextInt();
		sc.close();
		if(num < 0)
			System.out.println("Provide valid number");
		else {
			if(isPalindrome(num))
				System.out.println(num+ " is palindrome");
			else
				System.out.println(num+ " is not palindrome");
		}
	}

}
