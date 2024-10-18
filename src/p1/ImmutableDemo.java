package p1;

public class ImmutableDemo {
public static void main(String[] args) {
	String s ="hi";
	s.concat("hello");
	
	System.out.println(s);
	StringBuffer sb = new StringBuffer("arabinda");
	StringBuffer sb2 =new StringBuffer("mohanty");
	sb.append(sb2);
	
	System.out.println(sb);
	String s1 = new String("core java");
	String s2 = new String("selenium");
	s1.concat(s2);
	System.out.println(s1);
}
}
