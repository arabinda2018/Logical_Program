package p1;

public class RevereString {
public static void main(String[] args) {
	String s ="tit";
	String temp =s;
	String rev="";
	for(int i =s.length()-1;i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	if(rev.equals(temp)){
		System.out.println(temp+" is palindrome");
		
	}
	else {
		System.out.println(temp+" is not palidrome");
	}
}
}
