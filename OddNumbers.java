package day2;

public class OddNumbers {

	public static void main(String[] args) {
		System.out.println("Odd numbers between 1 & 100 using for loop is:");
		for(int i=1; i<=100; i++) {
			if(i%2 == 1) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		System.out.println();
		int i=1, num=100;
		System.out.println("Odd numbers between 1 & 100 using while loop is:");
		while(i<=num) {
			System.out.print(i+" ");
			i+=2;
		}
	}

}
