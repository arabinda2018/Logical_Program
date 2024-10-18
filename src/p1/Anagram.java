package p1;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//silent listen brainy binary  silent hitler
		//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase.

		//1.sort the data in a string
		//2 compare the sorted data.
		//if after sorting strigns are equal :Anagram
		String x ="HE Is aRAdHYA";
		String y ="is he HrADAYA";
		x=x.replace(" ","");
		y=y.replace(" ","");
		x=x.toLowerCase();
		y=y.toLowerCase();
		char[]a=x.toCharArray();
		char[]b=y.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean results = Arrays.equals(a, b);
		if(results==true) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}
	}
}
