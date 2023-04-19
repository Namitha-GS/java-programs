package day4;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachWordInString {
	
	private static void count(String s) {
		Map<String, Integer> map = new HashMap<>();
		String[] strArr = s.split("[ ,;:!.]");
		for(String s1 : strArr) {
			if(!s1.isEmpty()) {
				if(!map.containsKey(s1))
					map.put(s1, 1);
				else
					map.put(s1,  map.get(s1)+1);
			}
		}
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println("Count of "+m.getKey()+" is : "+m.getValue());
		}
		int count=0;
		for(int i : map.values()) {
			count += i;
		}
		System.out.println("Total no. of words : "+count);
	}

	public static void main(String[] args) {
		String s = "hello Hello HEllo hi hi: hi! Welcome,   welcome ; cat";
		count(s.toLowerCase());
	}

}
