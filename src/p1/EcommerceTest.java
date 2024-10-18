package p1;

public class EcommerceTest extends Ecommerce {
	
	public void doLogin(String Username,String password,String Cvv) {
		System.out.println("entered user name "+Username);
		System.out.println("enter password"+password);
	}
	public static void main(String[] args) {
		EcommerceTest etest = new EcommerceTest();
		etest.doLogin("arabinda", "ara@123", "421");
		etest.doLogin("jyoti", "jy@123");
	}
}
if i write 