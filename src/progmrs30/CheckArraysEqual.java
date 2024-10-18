package progmrs30;

import java.util.Arrays;

public class CheckArraysEqual {
	public static void main(String[] args) {
		int[] x= {10,20,30,40,50};
		int[] y= {10,20,30,40,50};
		//	boolean result = Arrays.equals(x, y);
		
		//	if(result==true) {
		//		System.out.println("arrays are equal");
		//	}
		//	else {
		//		System.out.println("Arrays are not equal");
		//	}

		boolean status = true;
		if(x.length==y.length) {
			for(int i =0;i<x.length;i++) {
				if(x[i]!=y[i]) {
					status =false;
				}
			}

		}
		else {
			status =false;
		}
		
		
		if(status ==true) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
}
