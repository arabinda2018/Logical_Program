package arrays;

public class A {
	
public static void main(String[] args) {
	
	Object[]a= {10,20,30,10,20,true,true,false};
	for(int i =0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[i]);
			}
		}
	}
}
}
