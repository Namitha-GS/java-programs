package day1;

import java.util.Arrays;

public class RotateAnArrayByKpositions {
	
	private static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		int n = arr.length;
		int k = 4;
		reverse(arr, 0, n-k-1);
		reverse(arr, n-k, n-1);
		reverse(arr, 0, n-1);
		System.out.println("Rotate Right: "+Arrays.toString(arr));
		
		arr = new int[] {1,2,3,4,5,6,7};
		int d = 2;
		reverse(arr, 0, d-1);
		reverse(arr, d, n-1);
		reverse(arr, 0, n-1);
		System.out.println("Rotate Left: "+Arrays.toString(arr));
	}

}
