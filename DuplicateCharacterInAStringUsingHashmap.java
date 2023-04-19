package day4;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInAStringUsingHashmap {

	public static void main(String[] args) {
		String s = "test string";
		findDuplicates(s);
	}
	
	private static void findDuplicates(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(!map.containsKey(c))
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
		}
		
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			if(m.getValue() > 1)
				System.out.println("Count of "+m.getKey()+" is : "+m.getValue());
		}
	}

}
