package progmrs30;

public class Sum {
	public static void main(String[] args) {
		int sum=0;
		
		int[]a= {10,20,30,40,50};
		for(int i =0;i<a.length;i++) {
			sum=a[i]+sum;
		}
		System.out.println(sum);
	}



}
