package p1;

public class Demo {
	private String accountnumber;
	private String cvvnumber;
	private String OTP;
	
	public void setAccountNumber(String accountnumber) {
		this.accountnumber=accountnumber;
	}
	public void  setCVVNumber(String cvvnumber) {
		this.cvvnumber=cvvnumber;
	}
	public void setOTP(String OTP) {
		this.OTP=OTP;
	}
	public String getAccountNumber() {
		return accountnumber;
	}
	public String  getcvvNumber() {
		return cvvnumber;
	}
	public String getOTP() {
		return OTP;
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.setAccountNumber("1234 5678 9861 4232");
		System.out.println(d.getAccountNumber());
		d.setCVVNumber("124");
		d.setOTP("1243");
		System.out.println(d.getcvvNumber());
		System.out.println(d.getOTP());
	}
}
