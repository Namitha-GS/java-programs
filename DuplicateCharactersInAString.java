package day4;

public class DuplicateCharactersInAString {

	static int char_cnt = 255;
	
	public static void main(String[] args) {
		String s = "test string";
		fillArray(s);
	}
	
	private static void fillArray(String s) {
		int[] countArr = new int[char_cnt];
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			countArr[c] = countArr[c] + 1;
		}
		
		for(int i=0; i<char_cnt; i++) {
			if(countArr[i] > 1)
				System.out.println("Count of "+(char)i+" is : "+countArr[i]);
		}
	}

}
