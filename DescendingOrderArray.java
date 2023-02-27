package day2;

import java.util.Arrays;

public class DescendingOrderArray {
	
	private static void descendingSort(int[] arr, int len) {
		int temp =0;
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = {5,4,6,2,8,1,9,3};
		descendingSort(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
