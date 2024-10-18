package progmrs30;

public class FactorialNumber {
public static void main(String[] args) {
	int num=5;
	long factorial=1;
	//for(int i=1;i<=num;i++) {
		for(int i =num;i>1;i--) {
		factorial =factorial*i;
	}
	System.out.println("Factorial of number is "+factorial);
}
}
