package day1;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
	    int count=0, num=1, i;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter which prime no is to be printed:");
	    int n = sc.nextInt();
	    sc.close();
	    while(count < n) {
	    	num = num + 1;
	    	for(i=2; i<=num; i++) {
	    		if(num%i == 0) {
	    			break;
	    		}
	    	}
	    	if(num == i)
	    		count++;
	    }
	    System.out.println("The "+n+"th prime no. is: "+num);
	 }

}
