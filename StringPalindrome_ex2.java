package day3;

import java.util.Scanner;

public class StringPalindrome_ex2 {
	
	private static boolean isValid(String s) {
		char[] ch = s.toCharArray();
		for(char c : ch) {
			if(!Character.isLetter(c))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		sc.close();
		if(isValid(s)) {
			String reverse = new StringBuffer(s).reverse().toString();
			if(reverse.equals(s))
				System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");
		} 
		else {
			System.out.println("Invalid input");
		}
	}

}
