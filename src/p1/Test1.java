package p1;

import java.util.Arrays;

public class Test1 {
public static void main(String[] args) {
	String x ="corejava";
	String y ="co  re Java";
	x=x.replace(" ", "");
	y=y.replace(" ", "");
	x=x.toLowerCase();
	y=y.toLowerCase();
	char[]a=x.toCharArray();
	char[]b=y.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	Boolean result =Arrays.equals(a, b);
	if(result==true) {
		System.out.println("anagram");
		
	}
	else {
		System.out.println("not an anagram");
	}
}
}
