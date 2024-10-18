package progmrs30;

import java.util.Scanner;

public class Largestof3Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a =sc.nextInt();
		
		System.out.println("Enter second number");
		int b =sc.nextInt();

		System.out.println("Enter third number");
		int c =sc.nextInt();
//		if(a>b && a>c) {
//			System.out.println(a+"is largest number ");
//		}
//		else if(b>a && b>c) {
//			System.out.println(b+ "b is largest number");	
//		}
//		else {
//			System.out.println(c+" is largest number");
//		}
		
		//ternary operator
		
	int largest1=	a>b ?a:b;//largest of a and b
	int largest2=c>largest1 ? c:largest1;//largest of c & largest1
	int largest=c>(a>b ?a:b) ? c:(a>b ?a:b);
System.out.println(largest);
	}
}
