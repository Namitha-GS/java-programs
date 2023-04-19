package day4;

public class ReverseWordsInString {
	
	private static void reverseString(String s) {
		StringBuilder sb = new StringBuilder();
		int end = s.length();
		int index = s.length()-1;
		for(int i=s.length()-1; i>=0; i--) {
			if(s.charAt(i) == ' ' || i == 0) {
				if(i != 0) {
					sb.append(s.substring(i+1, end));
					sb.append(" ");
				} else {
					sb.append(s.substring(i, end));
				}
				end = index;
			}
			index--;
		}
		System.out.println("Approach-2=> "+sb.toString());
	}

	public static void main(String[] args) {
		String s = "Hello nami, how are you";
		String[] strArr = s.split(" ");
		String ans = "";
		for(int i=strArr.length-1; i>=0; i--) {
			ans += strArr[i] + " ";
		}
		System.out.println("Approach-1=> "+ans.substring(0, ans.length()-1));
		
		reverseString(s);
	}

}
