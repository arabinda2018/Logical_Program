package p1;

public class Loops {
public static void main(String[] args) {
	int[]x= {10,20,30,40,58};
	int i=0;
	int sum =0;
	int size =x.length;
	do {
		sum=sum+x[i];
		i++;
		
	}
	while(i!=size);
	System.out.println("Sum of the array is "+sum);
}
}
