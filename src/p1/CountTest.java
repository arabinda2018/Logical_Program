package p1;

import java.util.HashMap;

public class CountTest {
	public static void main(String[] args) {
		String s ="arabinda";
		//a2 
		//r1
		//b1
		//i1
		//n1
		HashMap<Character,Integer>hs = new HashMap<Character, Integer>();

		char[] ch = s.toCharArray();
		for(Character c :ch) {
			if(!(hs.containsKey(c))) {
				hs.put(c, 1);
			}
			else {
				hs.put(c,hs.get(c)+1);				
			}
		}
System.out.println(hs);


	}
}
