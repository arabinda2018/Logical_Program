package p1;

import java.util.Arrays;

public class AnagramTest {
public static void main(String[] args) {
	//silent
	//listen
	String x ="si  le  nt";
	String y ="lis  te n";
	x=x.replace(" ", "");
	y =y.replace(" ", "");
	x = x.toLowerCase();
	y=y.toLowerCase();
	char[] a = x.toCharArray();
	char[] b = y.toCharArray();
	
	Arrays.sort(a);
	Arrays.sort(b);
	boolean result = Arrays.equals(a, b);
	if(result==true) {
		System.out.println("anagram");
	}
	else {
		System.out.println("not an anagram");
	}
}
}
