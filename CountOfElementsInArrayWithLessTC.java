package day1;

import java.util.HashMap;
import java.util.Map;

public class CountOfElementsInArrayWithLessTC {
	
	//Time complexity = O(n)
	private static void countfreq(int[] arr, int n) {
		Map<Integer, Integer> mp = new HashMap<>();
		for(int i=0; i<n; i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i], mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i], 1);
			}
		}
		System.out.println(mp);
		for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			System.out.println("Count of "+entry.getKey()+" is: "+entry.getValue());
		}
	}
	
	public static void main(String args[]) {
		int[] arr = {1,2,2,3,1,1,3,2,1,1,4};
		countfreq(arr, arr.length);
	}
}
