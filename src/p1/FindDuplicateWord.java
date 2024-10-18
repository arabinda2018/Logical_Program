package p1;

import java.util.Arrays;
import java.util.HashMap;

public class FindDuplicateWord {
	public static void main(String[] args) {
	String x ="i have a boy and a girl and a cow";
	HashMap<String, Integer>h=new HashMap<String, Integer>();
	
	String[] words = x.split(" ");
	for(String word:words) {
		
		if(!(h.containsKey(word))) {
			h.put(word, 1);			
		}
		else {
			h.put(word, h.get(word)+1);
		}
		
	}
	System.out.println(h);
	
	}
}
