package day3;

public class TotalNoOfCharactersInString {

	public static void main(String[] args) {
		String s = "ABC DEF GHI KL";
		int count = 0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) !=' ')
				count++;
		}
		System.out.println("No of characters are: "+count);
	}

}
