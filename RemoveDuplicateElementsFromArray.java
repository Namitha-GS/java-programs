package day2;

import java.util.Arrays;

public class RemoveDuplicateElementsFromArray {
	/*
	 * Using Extra space
	 */
	private static int removeDuplicates(int[] a, int length) {
		if(length == 0 || length == 1)
			return length;
		
		int j=0;
		int[] temp = new int[length];
		for(int i=0; i<length-1; i++) {
			if(a[i] != a[i+1]) {
				temp[j++] = a[i];
			}
		}
		temp[j++] = a[length-1];
		
		for(int i=0; i<temp.length;i++)
			a[i] = temp[i];
		return j;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,1,3,1,2,4,6,6,3,8};
		Arrays.sort(arr);
		int n = removeDuplicates(arr, arr.length);
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
