package day3;

import java.util.Scanner;

public class StringPalindrome_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		sc.close();
		s = s.toLowerCase();
		int start = 0, end = s.length()-1;
		boolean flag = true;
		while(start < end) {
			if(s.charAt(start) != s.charAt(end)) {
				flag = false;
				break;
			}
			start++;
			end--;
		}
		if(flag == true)
			System.out.println("Given String is Palindrome");
		else
			System.out.println("Given String is Not Palindrome");
	}

}
