package p1;

public class PalindromeNo {
	public static void main(String[] args) {
		int no =1518;
		int temp=no;
		int rev=0;
		while(no!=0) {
			int rem=no%10;
			rev=rev*10+rem;
			no=no/10;


		}
		if(rev==temp) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}
}