package day2;

public class PrintEvenOddPositionsOfArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println("Even Position elements of an Array are:");
		for(int i=1; i<arr.length; i=i+2) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("Odd Position elements of an Array are:");
		for(int i=0; i<arr.length; i=i+2) {
			System.out.print(arr[i]+" ");
		}
	}

}
