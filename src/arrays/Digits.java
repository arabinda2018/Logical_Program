package arrays;

public class Digits {
public static void main(String[] args) {
	int num =123324;//6 digit
	
	int count=0;
	
	while(num!=0) {
		num=num/10;
		count++;
	}
	System.out.println("Total digit :"+count);
	
}
}
