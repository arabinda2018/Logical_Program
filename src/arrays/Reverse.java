package arrays;

public class Reverse {
public static void main(String[] args) {
	int num=121;//check number is palindrome or not.
	int temp =num;
	int rev =0;
	while(num>0) {
		int rem=num%10;
		 rev =rev*10+rem;//
		 num=num/10;
	}
	if(temp==rev) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
}
}
