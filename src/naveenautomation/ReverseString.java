package naveenautomation;

public class ReverseString {

	public static void main(String[] args) {
		
		//Reverse a String
		//diff bw string and stringbuffer
		//do we have revese function in String
		String s ="selenium";
		//1.Using for loop
		int len=s.length();
		String rev="";
		for(int i =len-1;i>=0;i--) {
			rev=rev+s.charAt(i);//mui

		}
		System.out.println(rev);
		
		//2.Using StriingBuffer class
		StringBuffer sf = new StringBuffer(s);
		sf.reverse();
		System.out.println(sf);
	}

}
