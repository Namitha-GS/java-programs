package day4;

public class LongestSmallestWordInString {
	
	private static String largestWord(String s) {
		String[] strArr = s.split(" ");
		String largest="";
		for(String str : strArr) {
			if(str.length() > largest.length())
				largest = str;
		}
		return largest;
	}
	
	private static String smallestWord(String s) {
		String[] strArr = s.split(" ");
		String smallest = strArr[0];
		for(String str : strArr) {
			if(str.length() < smallest.length())
				smallest = str;
		}
		return smallest;
	}

	public static void main(String[] args) {
		String s = "Apple is red"; //"Hardships often prepare ordinary people for an extraordinary destiny";
		System.out.println("Smallest is: "+smallestWord(s));
		System.out.println("Largest is: "+largestWord(s));
	}

}
