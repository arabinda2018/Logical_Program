package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionConcepts2 {
	public static void main(String[] args) {
		ArrayList<Integer>al = new ArrayList<Integer>();
		al.add(4);
	
		al.add(9);
		al.add(3);
		al.add(4);
		al.add(3);
		Set<Integer> s= new HashSet<Integer>();
		for(Integer a :al) {
			if(s.add(a)==false) {
				System.out.println(a  +"duplicate character");
			}
		}
	}
}

