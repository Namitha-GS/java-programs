package practice_prgm;

public class FibonacciSeriesWithRecursion {
	
	static int n1=0, n2=1;
	
	private static void printFibonacci(int cnt) {
		if(cnt > 0) {
			int n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2 = n3;
			printFibonacci(cnt-1);
		}
	}

	public static void main(String[] args) {
		System.out.print(n1+" "+n2);
		int count = 10;
		printFibonacci(count-2);
	}

}
