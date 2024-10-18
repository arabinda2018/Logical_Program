package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DuplicateHashMap2 {
	public static void main(String[] args) {
		String s="volvo";
		//v 2
		//o 2
		//l 1
		HashMap<Character, Integer>h = new HashMap<Character, Integer>();		
		char[]ch=s.toCharArray();
		
		for(Character c:ch) {
			if(!(h.containsKey(c))) {
				h.put(c,1);
				
			}
			else {
				h.put(c, h.get(c)+1);
			}
		}
		System.out.println(h);
	}
}

