package progmrs30;

import p1.ReverseWord;

public class ReverseEachStringinaString {
	public static void main(String[] args) {
		//Approach 1:
		String str ="Welcome to java";//original String.
		String[] words = str.split(" ");//Splitting String into words.
		String reverseString="";
		for( String w:words) {//to
			String reverseword="";
			for(int i =w.length()-1;i>=0;i--) {//ot
				reverseword=reverseword+w.charAt(i);
			}
			reverseString=reverseString+reverseword+ " ";//emocleW ot avaj
		}

		System.out.println(reverseString);
		
		//approach 2:
		String[]words_=str.split("\\s");
		String reverseword="";
		for(String w:words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			reverseword=reverseword+sb.toString()+" ";
		}
	}
}
