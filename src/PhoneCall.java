
public class PhoneCall extends Communication{
	private int callDur;
	
	public PhoneCall(String num1, String num2, int day ,int month, int year, int callDur) {
		super(num1, num2, day, month, year);
		this.callDur = callDur;
	}

	public void printInfo() {
		
	}
}
