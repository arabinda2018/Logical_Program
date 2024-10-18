package p1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionConcepts {
	public static void main(String[] args) {
		ArrayList<Integer>a= new ArrayList<Integer>();
		a.add(3);
		a.add(3);
		a.add(9);
		a.add(1);
		a.add(2);
		a.add(2);
		//	System.out.println(a);
		//	Collections.sort(a);
		//	System.out.println(a);
		//	Collections.sort(a,Collections.reverseOrder());
		//	System.out.println(a);

		Set<Integer> s = new HashSet<Integer>();

		for(int name : a) {
			System.out.println(name);
			if(s.add(name) == false)
				System.out.println(name + " is duplicated");
		}
	}
}

