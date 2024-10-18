package progmrs30;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","C","C++","Python","java"};


		//Approach 1:
		//		boolean flag =false;
		//		for(int i =0;i<arr.length;i++) {
		//			for(int j=i+1;j<arr.length;j++) {
		//				if(arr[i]==arr[j]) {
		//					System.out.println("Found duplicate element"+arr[i]);
		//					flag=true;
		//				}
		//			}
		//
		//		}
		//		if(flag==false) {
		//			System.out.println("Duplicate Element not found");
		//		}
		//Approach2:

		Set<String> sh =new HashSet<String>();
		boolean flag=false;
		for(String s:arr) {
			if(sh.add(s)==false) {
				System.out.println("Find duplicate element  :"+s);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("no duplicate");
		}

	}

}
