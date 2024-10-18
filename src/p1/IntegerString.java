package p1;

public class IntegerString {
	public static void main(String[] args) {


		//Verify if a  string contains only integer.
		String x="97452";
	
		char[]y=x.toCharArray();
		
		int size=y.length;
		int i =0;
		while(i!=size) {
			if(y[i]>='0' &&y[i]<='9') {
				i++;
			}
			else {
				System.out.println("not an integer string");
				System.exit(0);
			}
		}
		System.out.println("Integer String");
	}

}
