package progmrs30;

public class SwappingTwoNumbers {

	public static void swapWithTemp(int a, int b) {
		System.out.println("before swpap :"+a);
		System.out.println("before swap  :"+b);
		int t =a;
		a =b;
		b=t;
		System.out.println("After swap :"+a);
		System.out.println("After swap  :"+b);

	}
	public static void swapWithoutTemp(int a,int b) {
		System.out.println("before swpap :"+a);
		System.out.println("before swap  :"+b);
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println("After swap :"+a);
			System.out.println("After swap  :"+b);
		
	}
	public static void swapWitsubdiv(int a,int b) {
		System.out.println("before swpap :"+a);
		System.out.println("before swap  :"+b);
		//here a & b  values should not be zero.
		 a=a*b;
		 b=a/b;
		 a=a/b;
		 System.out.println("After swap :"+a);
			System.out.println("After swap  :"+b);
			}
	public static void swapWithXOR(int a,int b) {
		//bitwise XOR(^) operator.
		//both are same output is zero.
		System.out.println("before swpap :"+a);
		System.out.println("before swap  :"+b);
		a=a^b;
		b=a^b;
		a=a^b;
		 System.out.println("After swap :"+a);
			System.out.println("After swap  :"+b);
			}
	public static void swap(int a,int b) {
		System.out.println("before swpap :"+a);
		System.out.println("before swap  :"+b);
		b=a+b-(a=b);
		
		System.out.println("After swap :"+a);
			System.out.println("After swap  :"+b);
			}
	
		public static void main(String[] args) {

		//swapWithTemp(4,5);
		//swapWithoutTemp(9,7);
		//swapWitsubdiv(10, 20);
		//swapWithXOR(2,5);
		swap(3,7);
	}

}
