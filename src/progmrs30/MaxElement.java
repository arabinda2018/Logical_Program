package progmrs30;

public class MaxElement {
public static void main(String[] args) {
	int[]a= {10,20,30,40,50};
	int length= a.length;
	
	//find maximum element from the array
	findMax(a,length);	
}

public static void findMax(int []a,int length) {
	
	int max =a[0];
	for(int i =0;i<length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println(max);
	
}
}
