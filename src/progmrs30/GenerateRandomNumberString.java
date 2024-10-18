package progmrs30;

import java.util.Random;

public class GenerateRandomNumberString {
public static void main(String[] args) {
	Random rand= new Random();
	
	int nextInt = rand.nextInt(9999);
	System.out.println(nextInt);
	
	double nextDouble = rand.nextDouble();
	System.out.println(nextDouble);
	
	double random = Math.random();
System.out.println(random);	

}
}
