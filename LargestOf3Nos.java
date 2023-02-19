package day1;

import java.util.Scanner;

public class LargestOf3Nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st no:");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd no:");
		int b = sc.nextInt();
		System.out.println("Enter the 3rs no:");
		int c = sc.nextInt();
		sc.close();
		int largest = (((a>b)?a:b) > c) ? ((a>b?a:b)) : c;
		System.out.println("The largest is:"+largest);
		
		int smallest = (((a<b)?a:b) < c) ? ((a<b?a:b)) : c;
		System.out.println("The smallest is:"+smallest);
	}

}
