package day3;

import java.util.Arrays;

public class AnagramCheckOfString {
	
	private static boolean anagramCheck(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0; i<ch1.length; i++) {
			if(ch1[i] != ch2[i])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "Grab";
		String s2 = "bRag";
		
		if(anagramCheck(s1, s2)) {
			System.out.println("Yes, it is Anagram");	
		} else {
			System.out.println("No, it is not Anagram");
		}
	}

}
