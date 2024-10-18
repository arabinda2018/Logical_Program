package p1;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayConcept {
public static void main(String[] args) {
	int [] num1 = {1,2,2,4,3,4,5,6,3,8};
	int [] num2= new int[100];
	
//	ArrayList<Integer> intList = new ArrayList<Integer>();
//	for (int i : numbers)
//	{
//	    intList.add(i);
//	}
//	
//	System.out.println(intList);
//	
//	HashSet<Integer> h=new HashSet<Integer>();
//	h.addAll(intList);
//	
//	System.out.println(h);
//	
//	Object[] a=h.toArray();
//	System.out.println(a);
//	
//	for(Object o:a)
//	{
//		System.out.println(o);
//	}
	
	
	int count=0;
	
	for(int i=0;i<=num1.length;i++) {
		
		for(int j=i+1;j<num1.length;j++)
		{
			if(!(num1[i]==num1[j]))
			{
				num2[count]=num1[i];
				count++;
				
			}
		}
	}
	
	for(Integer i:num2) {
		System.out.println(i);
	}
	
	
	
	
}
}
