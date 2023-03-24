package day3;

import java.util.Arrays;

public class SubSetOfString {

	public static void main(String[] args) {
		String s = "abcd";
		int leng = s.length();
		String[] arr = new String[leng * (leng+1)/2];
		int temp = 0;
		for(int i=0; i<leng; i++) {
			for(int j=i; j<leng; j++) {
				arr[temp] = s.substring(i, j+1);
				temp++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
