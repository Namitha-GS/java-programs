package day3;

public class VowelConsonentCountOfString {

	public static void main(String[] args) {
		String s = "AbcdefGh,iJkl MnoPqRstu:VWx Yz^ ";
		s = s.toLowerCase();
		int vcount=0, ccount=0;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
				vcount++;
			else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
				ccount++;
		}
		System.out.println("Vowel count= "+vcount);
		System.out.println("Consonent count= "+ccount);
	}

}
