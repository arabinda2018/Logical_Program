package p1;

public class LowerToUpper3 {
public static void main(String[] args) {
	String x="aradhya   brilliance   center";
	char[]y=x.toCharArray(); 
	int size =y.length;
	int i=0;
	while(i!=size) {
		if(y[i]!=' ')
		y[i]=(char)(y[i]-32);
		i++;
	}
	System.out.println(y);
}
}
