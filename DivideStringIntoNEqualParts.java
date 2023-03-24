package day3;

public class DivideStringIntoNEqualParts {
	
	private static void divideString(String s, int n) {
		// n - indicates no of parts
		
		if(s.length() % n != 0) {
			System.out.println("String cannot be divided Equally");
			return;
		}
		
		int part_size = s.length()/n;
		for(int i=0; i<s.length(); i++) {
			if(i % part_size == 0)
				System.out.println();
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		String s = "aaabbbcccdddeee";
		divideString(s, 5);
	}

}
