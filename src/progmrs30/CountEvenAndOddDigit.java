package progmrs30;

public class CountEvenAndOddDigit {
	public static void main(String[] args) {
		int num=45297;
		int evencount=0;
		int oddcount=0;
		while(num!=0) {
			int rem =num%10;
			if(rem%2==0) {
				evencount++;
			}
			else {
				oddcount++;
			}
			num =num/10;
		}
		System.out.println("Event number :"+evencount);
		System.out.println("odd number "+oddcount);

	}
}
