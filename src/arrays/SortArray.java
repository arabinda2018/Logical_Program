package arrays;

import java.util.Arrays;

public class SortArray {
public static void main(String[] args) {
	int[]a= {15,10,17,20,10,25};
	System.out.println("Arrays before sorting"+Arrays.toString(a));
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			
		}
	}
	System.out.println("Arrays after sorting"+Arrays.toString(a));
}
}
