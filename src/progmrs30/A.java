package progmrs30;

public class A {
public static void main(String[] args) {
	String s="Corejava@123!!#$%^";
	s=s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(s);
	
	
}
}
