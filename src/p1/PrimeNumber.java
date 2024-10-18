package p1;

public class PrimeNumber {
public static void main(String[] args) {
//	int no=9;
//	int count =0;
//	if(no>1) {
//		for(int i =1;i<=no;i++) {
//			if(no%i==0) {
//				count++;
//			}
//		}
//		if(count==2) {
//			System.out.println("Prime number");
//		}
//		else {
//			System.out.println("not a prime number");
//		}
//		
//		
//	}
//	else {
//		System.out.println("not a prime number");
//	}
	
	
	for(int i =1;i<=100;i++) {
		int count =0;
		for(int j =1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
			
		}
		if(count==2)
		System.out.println(i);
	}
	
	
}
}
