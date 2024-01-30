package logical;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	public static void getCharCount(String name) {
		
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		char strArray[] = name.toCharArray();
		for(char c : strArray) {
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c) + 1);
			}else {
				charmap.put(c, 1);
			}
		}
		System.out.println(charmap);
		
	}
	
	public static void getchar(String name1) {
		
		Map<Character, Integer> charmap1 = new HashMap<Character, Integer>();
		char strarray[] = name1.toCharArray();
		for(char c1 : strarray) {
			if(charmap1.containsKey(strarray)) {
				charmap1.put(c1, charmap1.get(c1) +1);
			}else {
				charmap1.put(c1, 1);
			}
		}System.out.println(charmap1);
	}
	
	public static void main(String[] args) {
		
		getCharCount("test");
		getchar("Abhijit");
	}

}
