
public class SMS extends Communication {
	private String sms;
	
	public SMS(String num1, String num2, int day, int month, int year, String sms) {
		super(num1, num2, day, month, year);
		this.sms = sms;
	}

	public void printInfo() {
		
	}
}
