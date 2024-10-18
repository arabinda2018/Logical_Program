package progmrs30;

public class SumArray {
public static void main(String[] args) {
	int a[]= {4,5,7,4};
	int sum =0;
//	for(int i =0;i<a.length-1;i++) {
//		sum =sum+a[i];
//	}
	
	for(int nums:a) {
		sum+=nums;
	}
	System.out.println(sum);
}
}
