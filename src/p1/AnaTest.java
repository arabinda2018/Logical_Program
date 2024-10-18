package p1;

import java.util.Arrays;

public class AnaTest {
public static void main(String[] args) {
	String x="core java";
	String y ="CoreJava   ";
	
	 x=x.replace(" ", "");
	 y=y.replace(" ", "");
	x= x.toLowerCase();
	y=y.toLowerCase();
	char[] a = x.toCharArray();
	char[] b = y.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	boolean result = Arrays.equals(a, b);
	if(result==true) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
}
}
