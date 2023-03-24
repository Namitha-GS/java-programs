package day3;

public class LongestRepeatingSubSequenceInString {
	
	private static String longestRepeatingSeq(String s, String t) {
		int n = Math.min(s.length(), t.length());
		for(int i=0; i<n; i++) {
			if(s.charAt(i) != t.charAt(i))
				return "";
		}
		return s.substring(0, n);
	}

    public static void main(String[] args) {  
    	String s = "lmnoabcdnomlamsno"; 
    	String lrs = "";
    	int n = s.length();
    	for(int i=0; i<n; i++) {
    		for(int j=i+1; j<n; j++) {
    			String x = longestRepeatingSeq(s.substring(i, n), s.substring(j, n));
    			
    			if(x.length() > lrs.length())
    				lrs = x;
    		}
    	}
    	System.out.println("Longest repeating sequence is : "+lrs);
    }
       
}
