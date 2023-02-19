package day1;

import java.util.Arrays;

public class CopyFrom1arrayToAnotherArray {

	public static void main(String[] args) {
		int arr1[] = {2,4,6,8,0};
		int arr2[] = new int[arr1.length];
		for(int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		System.out.println(Arrays.toString(arr2));

	}

}
