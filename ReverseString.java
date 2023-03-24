package day3;

import java.util.Scanner;

public class ReverseString {
	
	private static String reverseString(String s) {
		char[] ch = s.toCharArray();
		int i = 0, j = s.length()-1;
		while(i<j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
			i++;
			j--;
		}
		return String.valueOf(ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s = sc.nextLine();
		sc.close();
		
		// Method 1
		String reverseStr = "";
		for(int i=s.length()-1; i>=0; i--) {
			reverseStr += s.charAt(i);
		}
		System.out.println("Method 1 - Reversed string: "+reverseStr);
		
		// Method 2
		String reversedStr = reverseString(s);
		System.out.println("Method 2 - Reversed string: "+reversedStr);
	}

}
