package arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountCharacter {
public static void main(String[] args) {
	String s ="test";
	//t 2
	//e 1
	//s 1
	Map<Character, Integer>h = new HashMap<Character, Integer>();
	char[]ch=s.toCharArray();
	
	for(Character c :ch) {
		
		if( !(h.containsKey(c))) {//t e s
			h.put(c, 1);    //t e s
		}
		else {
			h.put(c, h.get(c)+1);
		}
	}
	System.out.println(h);
	
}
}
