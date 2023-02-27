package day2;

public class SmallestElementOfArray {
	
	private static int smallest(int[] arr, int len) {
		int min = arr[0];
		for(int i=0; i<len; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int[] arr = {12, 11, 16, 5, 89, 43, 99, 76, 42, 150, 98, 2, 50};
		System.out.println("Smallest element of an Array is: "+smallest(arr, arr.length));
	}

}
