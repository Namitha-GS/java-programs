package practice_prgm;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		sc.close();
		
		int temp = num, digit=0, sum=0;
		while(temp > 0) {
			temp = temp/10;
			digit++;
		}
		
		temp = num;
		
		while(num > 0) {
			int r = num % 10;
			num = num/10;
			sum += Math.pow(r, digit);
		}
		
		if(sum == temp)
			System.out.println(temp+" is Armstrong no.");
		else
			System.out.println(temp+ " is not Armstrong no.");
	}

}
