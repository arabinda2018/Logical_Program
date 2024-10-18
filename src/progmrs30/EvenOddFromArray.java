package progmrs30;

public class EvenOddFromArray {
	public static void main(String[] args) {
		int[]a= {10,25,17,8,12,18};
		
		System.out.println("Even number in an array .....");
		for(int i =0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd number in an array ......");
		for(int i =0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		
		//Enhanced for loop
		System.out.println("******");
		System.out.println("Even numbers");
		for(int even :a) {
			if(even%2==0) {				
				System.out.println(even);
			}			
		}
		System.out.println("******");
		System.out.println("odd numbers");
		for(int odd :a) {
			if(odd%2!=0) {				
				System.out.println(odd);
			}			
		}
		
	}
}
