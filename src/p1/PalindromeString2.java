package p1;

public class PalindromeString2 {
public static void main(String[] args) {
	String s ="too Hot to HOOT";
	s=s.replace(" ", "");
	s=s.toLowerCase();
	System.out.println(s);
	String reverse="";
	
	for(int i=s.length()-1;i>=0;i--) {
		reverse= reverse +s.charAt(i);
	}
	if(reverse.equals(s)) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	
}
}
