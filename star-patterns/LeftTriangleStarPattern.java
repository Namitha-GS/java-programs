package patterns;

import java.util.Scanner;

public class LeftTriangleStarPattern {
	
	/*
		    * 
			* * 
			* * * 
			* * * * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of triangle:");		
		int row = sc.nextInt();
		sc.close();
		for(int i=0; i<row; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
