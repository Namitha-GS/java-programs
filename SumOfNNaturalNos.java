package day2;

import java.util.Scanner;

public class SumOfNNaturalNos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter thr N value:");
		int n = sc.nextInt();
		sc.close();
		int sum = 0;
		for(int i=0; i<=n; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of "+n+" natural numbers using for loop is : "+sum);
		
		
		System.out.println();
		sum = 0;
		int i = 0;
		while(i<=n) {
			sum = sum + i;
			i++;
		}
		System.out.println("Sum of "+n+" natural numbers using while loop is : "+sum);
	}

}
