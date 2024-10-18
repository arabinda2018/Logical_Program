package progmrs30;

public class ReverseString {
	public static void main(String[] args) {


		String str ="ABCD";
	String reverse="";
	//Approach: Using String concatenation operator.
//		int len =str.length();
//		for(int i=len-1;i>=0;i--) {
//			reverse=reverse+str.charAt(i);
//		}
//		System.out.println(reverse);
		
		//2.using character array.
//		char[]a=str.toCharArray();
//		int len=a.length;
//		for(int i  =len-1;i>0;i--) {
//			reverse=reverse+a[i];
//		}
	
	//using stringbufferclass
	
	StringBuffer sb= new StringBuffer(str);
	System.out.println(sb.reverse());	
	}
}