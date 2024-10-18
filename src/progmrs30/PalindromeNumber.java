package progmrs30;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	//A palidrome number is number that remains the same when its digits are reserved like 16461
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number");
	int num =sc.nextInt();
	int org_num=num;
	int rev =0;
	while(num!=0) {
	rev =rev*10+num%10;
	num=num/10;
	}
	if(org_num==rev) {
		System.out.println(org_num+" Palindrome number");
	}
	else {
		System.out.println(org_num+ "Not a palindrome number");
	}
}
}
