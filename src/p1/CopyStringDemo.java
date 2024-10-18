package p1;
//1Creting a string object with x as the reference.
//2Extract the data from String object and place it in a character array y
//3Compute length of array y.
//4Create a new array  a with its size same as y
//5 create an index variable i and initialize to 0
//6 copy the data from y array to  a array.
//as long as (i!=size) 		place the y[i]in a[i]    increment i
public class CopyStringDemo {
	public static void main(String[] args) {
		String x="ABC tech";

		char y[]=x.toCharArray();

		int size =y.length;

		char[]a=new char[size];

		int i =0;

		while(i!=size) {
			a[i]=y[i];//copy
			//a[size-1-i]=y[i];//reverse
			i++;
		}
		System.out.println(y);
		System.out.println(a);
	}
}
