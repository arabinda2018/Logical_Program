package arrays;

public class SumArray {
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50,17,23,12};
		int sum =0;
		for(int i =0;i<a.length;i++) {
			//			sum=sum+a[i];
			//		}
			//		System.out.println(sum);

			if(a[i]%2!=0) {
				sum=sum+a[i];
			}

		}
		System.out.println(sum);
	}
}
