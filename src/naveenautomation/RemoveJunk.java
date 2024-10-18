package naveenautomation;

public class RemoveJunk {
	
	//Remove junk character from the string./unwanted character from the string.
public static void main(String[] args) {
	String s ="Core java@3424&*()$$#";
	s=s.replaceAll("[^A-Za-z0-9]", "");
	System.out.println(s);
}
}
