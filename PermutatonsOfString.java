package day3;

public class PermutatonsOfString {
	
	public static String swap(String s, int i, int j) {
		char[] b = s.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}
	
	public static void generatePermutation(String s, int start, int end) {
		if(start == end-1)
			System.out.println(s);
		else {
			for(int i=start; i<end; i++) {
				s = swap(s, start, i);
				generatePermutation(s, start+1, end);
				s = swap(s, start, i);
			}
		}
	}

	public static void main(String[] args) {
		String s = "ABCD";
		int len = s.length();
		System.out.println("Permutations are: ");
		generatePermutation(s, 0, len);
	}

}
