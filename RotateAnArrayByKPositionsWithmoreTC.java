package day1;

import java.util.Arrays;

public class RotateAnArrayByKPositionsWithmoreTC {
	
	private static void rotate(int[] arr, int length, int k) {
		for(int i=0; i<k; i++) {
			int x = arr[0];
			for(int j=1; j<length; j++) {
				arr[j-1] = arr[j];
			}
			arr[length-1] = x;
		}
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int k = 3;
		rotate(arr, arr.length, k);
		System.out.println(Arrays.toString(arr));
	}

}
