package day2;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArraywithLessTC {
	
	private static List<Integer> duplicates(int[] arr) {
		List<Integer> l = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			int index = Math.abs(arr[i]) - 1;
			
			if(arr[index] < 0)
				l.add(Math.abs(index + 1));
			
			arr[index] = -arr[index];
		}
		return l;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,4,3,5,6,5};
		System.out.println(duplicates(arr));
	}

}
