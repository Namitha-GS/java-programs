package day3;

public class ReplaceSpaceWithSpecificCharacter {

	public static void main(String[] args) {
		String str = "sab cde ghi";
		str = str.replaceAll("\\s", "-");
		System.out.println(str);
	}

}
