package p1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ReverseWord {
	public static void main(String[] args) {

		String sentence="java is a programming language";
		String reverseString="";
		String[] words = sentence.split(" "); 
		System.out.println(words.length);
		for(int i=words.length-1;i>=0;i--) {


			reverseString= reverseString+words[i]+" ";


		}
		System.out.println(reverseString);
	}
}
