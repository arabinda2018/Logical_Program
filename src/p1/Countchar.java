package p1;

import java.util.HashMap;

public class Countchar {
public static void main(String[] args) {
	String s ="volvo";
	char[] ch = s.toCharArray();
	HashMap<Character, Integer>hm = new HashMap<Character, Integer>();
	for(char  c:ch) {
		if(hm.containsKey(c)) {
			hm.put(c, 1);
		}
		else {
			hm.put(c, hm.get(c+1));
		}
		
	}
	System.out.println(hm);
}
}
