package day1;

import java.util.Scanner;

public class PrintAsciiEx1 {

	public static void main(String[] args) {
		System.out.println("Method 1:");
		char ch1 = 'a';
		char ch2 = 'b';
		int ascii1 = ch1;
		int ascii2 = ch2;
		System.out.println(ascii1 + "-" + ascii2);
		
		System.out.println("Method 2:");
		int ascii3 = 'c';
		int ascii4 = 'd';
		System.out.println(ascii3+"-"+ascii4);
		
		System.out.println("Method 3:");
		int ascii5 = (int)ch1;
		int ascii6 = (int)ch2;
		System.out.println(ascii5+"-"+ascii6);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character:");
		char ch = sc.next().charAt(0);
		sc.close();
		int ascii7 = (int)ch;
		System.out.println(ascii7);
	}

}
