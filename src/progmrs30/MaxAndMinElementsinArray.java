package progmrs30;

public class MaxAndMinElementsinArray {
	public static void main(String[] args) {

		int[]a= {10,20,30,15,5,25,15};
//		int max=a[0];
//
//		for(int i =0;i<a.length;i++) {
//			if(a[i]>max) {
//				max=a[i];
//			}
//		}
//		System.out.println(max);
		
		int  min=a[0];
		for(int i =0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
			
		}
		System.out.println(min);
	}
}
