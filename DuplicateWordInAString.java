package day4;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordInAString {
	
	private static void findDuplicates(String s) {
		String[] strArr = s.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for(String str : strArr) {
			if(!map.containsKey(str))
				map.put(str, 1);
			else
				map.put(str, map.get(str)+1);
				
		}
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue() > 1)
				System.out.println("Count of "+m.getKey()+" is : "+m.getValue());
		}
	}

	public static void main(String[] args) {		
		String s = "Good cat dog boy Good he she cat go cat";
		findDuplicates(s);		
	}

}
