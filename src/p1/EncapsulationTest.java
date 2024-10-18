package p1;

public class EncapsulationTest {
String password;
String cvvnumber;
String OTP;

public void SetPassword(String password) {
	this.password=password;
	
}
public void setCVVnumber(String cvvnumber) {
	this.cvvnumber=cvvnumber;
}
public void setOTP(String OTP) {
	this.OTP=OTP;
}
public String getPassword() {
	return password;
}
public String getCvvNumber() {
	return cvvnumber;
}
public String getOTP() {
	return OTP;
}
public static void main(String[] args) {
	EncapsulationTest et= new EncapsulationTest();
	et.setCVVnumber("143");
	et.setOTP("232");
	et.SetPassword("abc@123");
	System.out.println(et.getCvvNumber());
	
}
}
