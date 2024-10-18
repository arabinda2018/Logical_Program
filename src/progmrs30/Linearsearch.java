package progmrs30;

public class Linearsearch {
public static void main(String[] args) {
	int[]num= {10,20,35,40,67};
	int search=20;
	boolean flag =false;
	
	for(int i=0;i<num.length;i++) {
		if(num[i]==search) {
			System.out.println("find elemant  at:  "+i);
			flag=true;
			break;
			
		}
	}
	if(flag==false)
	System.out.println("Element not found");
}
}
