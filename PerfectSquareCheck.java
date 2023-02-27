package day2;

import java.util.Scanner;

public class PerfectSquareCheck {
	
	private static boolean checkSquare(int num) {
		for(int i=1; i*i<=num; i++) {
			if(num%i == 0 && num/i==i) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		if(checkSquare(num)) {
			System.out.println("Yes, its a Perfect Square");
		} else {
			System.out.println("No, its not a Perfect Square");
		}
	}

}
