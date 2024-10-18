package progmrs30;

import java.util.Scanner;

public class PalindromString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String s =sc.next();
	String orig_Str=s;
	String reverse="";
	
	for(int i=s.length()-1;i>=0;i--) {
		reverse =reverse+s.charAt(i);
	}
	if(reverse.equals(orig_Str)) {
		System.out.println(orig_Str+ " palindrome");
	}
	else {
		System.out.println(orig_Str+ " not a palindrome");
	}
}
}
