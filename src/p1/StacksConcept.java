package p1;

import java.util.Stack;

public class StacksConcept {
	public static void main(String[] args) {
		Stack<Integer>s = new Stack<Integer>();
		s.push(9);
		s.push(7);
		s.push(1);
		s.push(10);
		System.out.println(s);
		System.out.println(s.firstElement());
		
	}

}
