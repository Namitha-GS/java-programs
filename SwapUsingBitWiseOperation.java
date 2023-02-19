package day1;

import java.util.Scanner;

public class SwapUsingBitWiseOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int x = sc.nextInt();
		System.out.println("Enter 2nd no: ");
		int y = sc.nextInt();
		sc.close();
		System.out.println("Before swapping:"+x+" & "+y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("Swapped nos are: "+x+" & "+y);
	}

}
