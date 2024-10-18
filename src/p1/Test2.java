package p1;

public class Test2 {
	public static void main(String[] args) {
		String x="core java";
		char[] y=x.toCharArray();
		int size =y.length;
		char[]a= new char[size];
		int i =0;
		while(i!=size) {
			a[i]=y[i];
			i++;
		}



	}
}
