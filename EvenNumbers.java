package day2;

public class EvenNumbers {

	public static void main(String[] args) {
		System.out.println("Even nos. between 1 & 100 using for loop is:");
		for(int i=1; i<=100; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		
		System.out.println();
		System.out.println();
        int i=2, num=100;
        System.out.println("Even nos. between 1 & 100 using while loop is:");
        while(i<=num) {
        	System.out.print(i+" ");
        	i+=2;
        }
	}

}
