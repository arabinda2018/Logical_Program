package progmrs30;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num =sc.nextInt();
//		int rev=0;
//
//		while(num!=0) {
//			rev =rev*10+num%10;
//			num=num/10;
//		}
		
//		StringBuffer sb = new StringBuffer(String.valueOf(num));//convert number into string format
//		StringBuffer rev=sb.reverse();
//		System.out.println(rev);
		
		
		StringBuilder sbl = new StringBuilder();
		sbl.append(num);
		StringBuilder reverse =sbl.reverse();
		System.out.println(reverse);
	}
}
