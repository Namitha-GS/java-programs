package day3;

import java.util.HashMap;
import java.util.Map;

public class MinAndMaxOccurringCharacters {
	
    public static void main(String[] args) {
        String s = "abbccccc dd aeeeeg ff";
        s = s.replaceAll("\\s", "");
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
        	char c = s.charAt(i);
        	map.put(c,  map.getOrDefault(c, 0)+1);
        }
        int maxCnt = -1;
        char c = ' ';
        for(Map.Entry<Character, Integer> m : map.entrySet()) {
        	if(m.getValue() > maxCnt) {
        		maxCnt = m.getValue();
        		c = m.getKey();
        	}
        }
        System.out.println("Maximum occurring character: "+c);
        
        int minCnt = s.length();
        c = ' ';
        for(Map.Entry<Character, Integer> m : map.entrySet()) {
        	if(minCnt > m.getValue()) {
        		minCnt = m.getValue();
        		c = m.getKey();
        	}
        }
        System.out.println("Minimum occurring character: "+c);
    }
}