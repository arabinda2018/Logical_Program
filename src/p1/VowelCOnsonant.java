package p1;

public class VowelCOnsonant {
	public static void main(String[] args) {
		String x ="CORE@";
		char[]y=x.toCharArray();
		int size =y.length;
		int i =0;
		int vowelCount=0;
		int consonantCount=0;
		int specialCount=0;
		while(i!=size) {
			if(y[i]>='A' && y[i]<='Z') {
				if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U') {
					vowelCount++;
				}
				else {
					consonantCount++;
				}
			}
			else {
				specialCount++;
			}

			i++;	
		}
		System.out.println(y);
		System.out.println(vowelCount);
		System.out.println(consonantCount);
		System.out.println(specialCount);
	}
}
