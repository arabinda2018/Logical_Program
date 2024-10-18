package p1;

public class Decimal {
public static void main(String[] args) {
	String bin="";
	
	
	int num =24;
	while(num!=0) {
		int rem =num%2;
		System.out.println("rem:"+rem);
		bin =rem+bin;
		System.out.println("bin:"+bin);
		num =num/2;
		System.out.println("num:"+num);
	}
	System.out.println("Binary number is "+bin);
}
}
