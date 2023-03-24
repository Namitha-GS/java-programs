package day3;

public class CheckWhether1StringIsRotationOfAnother {

	public static void main(String[] args) {
		String s1 = "abcde", s2 = "deabc";
		if(s1.length() != s2.length())
			System.out.println("String is Not rotation of another");
		else {
			s1 = s1.concat(s1);
			if(s1.contains(s2))
				System.out.println("String is rotation of another");
			else
				System.out.println("String is Not rotation of another");
		}
	}
}
