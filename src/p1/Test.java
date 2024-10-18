package p1;

public class Test {
public static void main(String[] args) {
	String x="core java";
	x=x.concat("\0");
	char[]y=x.toCharArray();
	//int count =0;
	int i =0;
	while(y[i]!=0) {
		//count++;
		i++;
	}
	System.out.println(i);
}
}
