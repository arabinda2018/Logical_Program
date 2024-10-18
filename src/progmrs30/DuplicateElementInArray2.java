package progmrs30;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"java","C","C++","Python","java"};
		
		HashSet<String>h = new HashSet<String>();
		boolean flag =false;
		for(String s :arr) {
			if(h.add(s)==false) {
				System.out.println("duplicate element found :"+s);
				flag =true;
			}
		}
if(flag==false) {
	System.out.println("No Duplicate found");
}
	}

}
