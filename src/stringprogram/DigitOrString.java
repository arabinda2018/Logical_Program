package stringprogram;

import java.util.Scanner;

public class DigitOrString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String name=sc.nextLine();
	
	if(name.isEmpty()) {
		System.out.println("String ie empty");
	}
	if(name.matches("\\d+")) {
		System.out.println("String contains only digit ");
	}
	if(name.matches("^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,6}$")) {
		System.out.println("Valid email address");
	}
		else {
		System.out.println("Entered Sting is "+name);
	}
	
}
}
