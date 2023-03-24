package day3;

public class MaxAndMinOccurringCharacter {

	static int ASCII = 256;
	public static void main(String[] args) {
		int[] arr = new int[ASCII];
		String s = "abbbbbbccc dd eeeea noo";
		s = s.replaceAll("\\s", "");
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			arr[c] = arr[c] + 1;
		}
		int maxCnt = -1;
		char ch = ' ';
		for(int i=0; i<s.length(); i++) {
			if(maxCnt < arr[s.charAt(i)]) {
				maxCnt = arr[s.charAt(i)];
				ch = s.charAt(i);
			}
		}
		System.out.println("Maximum occurring character: "+ch);
		
		int minCnt = s.length();
		ch = ' ';
		for(int i=0; i<s.length(); i++) {
			if(minCnt > arr[s.charAt(i)]) {
				minCnt = arr[s.charAt(i)];
				ch = s.charAt(i);
			}
		}
		System.out.println("Minimum occurring character: "+ch);
	}

}
