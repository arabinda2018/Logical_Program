package p1;

public class VowelCOnsonant2 {
	public static void main(String[] args) {
		String x ="AAABBB@@";
		
		char[]y=x.toCharArray();
		int size=y.length;
		int vowelcount=0;
		int consonantcount=0;
		int specialcount=0;
		int i =0;
		while(i!=size) {
			if(y[i]>='A'&& y[i]<='Z') {
				if(y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U') {
					vowelcount++;
				}
				else {
					consonantcount++;
				}

			}
			else {
				specialcount++;
			}

			i++;
		}
		System.out.println("Vowel"+vowelcount);
		System.out.println("Consonant"+consonantcount);
		System.out.println("Special"+specialcount);
	}
}
