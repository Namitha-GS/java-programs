package day2;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. : ");
		int num = sc.nextInt();
		sc.close();
		if(num > 0)
			System.out.println(num+" is positive");
		else if(num < 0)
			System.out.println(num+" is negative");
		else
			System.out.println("Number is zero");
	}

}
