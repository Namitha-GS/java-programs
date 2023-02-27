package day2;

public class LargestElementOfArray {
	
	private static int largest(int[] arr, int length) {
		int max = arr[0];
		for(int i=0; i<length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {12, 11, 16, 5, 89, 43, 99, 76, 42, 150, 98, 50};
		System.out.println("Largest element of Array is: "+largest(arr, arr.length));
	}

}
