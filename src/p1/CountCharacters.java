package p1;

public class CountCharacters {
public static void main(String[] args) {
	String s="test";
	s=s.concat("\0");
	int count=0;;
	int i=0;
	char[] charArray = s.toCharArray();
	while(charArray[i]!=0) {
		i++;
		
		
	}
	System.out.println(i);
}
}
