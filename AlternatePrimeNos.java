package day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternatePrimeNos {
	
	private static boolean isPrime(int n) {
		if(n < 2) {
			return false;
		} else if(n==2) {
			return true;
		} else {
			for(int i=2; i<= (int)Math.sqrt(n); i++) {
				if(n%i == 0)
					return false;
			}
			return true;
		}
	}

	public static void main(String args[]) {
		int start = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter till where Prime nos. is to be printed: ");
	    int end = sc.nextInt();
	    sc.close();
	    List<Integer> l = new ArrayList<>();
	    while(start <= end) {
	    	if(isPrime(start)) {
	    		l.add(start);
	    	}
	    	start++;
	    }
	    for(int i=0; i<l.size(); i++) {
	    	if(i%2 == 0)
	    		System.out.print(l.get(i)+" ");
	    }
	}
}
