package day4;

public class ReverseStringWordByWord {
	
	private static void reverseStringWordByWord(String s) {
		char[] arr = s.toCharArray();
		int start = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ' ') {
				reverse(arr, start, i-1);
				start = i+1;
			}
		}
		reverse(arr, start, arr.length-1);
		System.out.println(arr);
	}
	
	private static void reverse(char[] arr, int start, int end) {
		while(start < end) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		String s = "Hello namitha how r you";
		reverseStringWordByWord(s);
	}

}
