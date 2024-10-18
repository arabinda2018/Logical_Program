package progmrs30;

public class MissingNumberArray {

	//Array shouldn't have duplicates
	//Array no need to be sorted order
	//Values should be in range.

	public static void main(String[] args) {
		int[]a= {1,2,4,5};
		int sum1=0;
		for(int i =0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of element in array :"+sum1);
		int sum2=0;
		for(int i =0;i<=5;i++) {
			sum2=sum2+i;

		}
		System.out.println("sum or range in array "+sum2);
		System.out.println("missing number is"+(sum2-sum1));

	}

}
