package day1;

import java.util.Scanner;

public class GCDof2nos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no:");
		int x = sc.nextInt();
		System.out.println("Enter 2nd no:");
		int y = sc.nextInt();
		sc.close();
		int gcd=1;
		for(int i=1; i<=x && i<=y; i++) {
			if(x%i == 0 && y%i == 0)
				gcd = i;
		}
		System.out.println("The GCD of "+x+" & "+y+" is: "+gcd);
	}

}
