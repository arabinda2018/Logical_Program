package progmrs30;

public class FibonacciSeries {
public static void main(String[] args) {
	//A series of number in which each number is the sum of the two preceding number;
	int n1=0,n2=1,sum=0;
	System.out.println(n1+" "+n2);
	
	for(int i =2;i<10;i++) {
		sum =n1+n2;
		System.out.println(" "+sum);
		n1=n2;
		n2=sum;
	}
	
}
}
