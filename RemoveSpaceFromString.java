package day3;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
		String str = "what    is your name? hello    ";
		str = str.replaceAll("\\s", "");
		System.out.println(str);
	}

}
