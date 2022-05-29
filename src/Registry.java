import java.util.ArrayList;

public class Registry {
	private ArrayList<Suspect> susps = new ArrayList<Suspect>();

	public void addSuspect(Suspect aSuspect) {
		for(int i=0; i<susps.size(); i++) {
			susps.add(aSuspect);
		}
	}

	public void addCommunication(Communication aCommunication) {
		for(int i=0; i<susps.size(); i++) {
			if(aCommunication.num1 == aCommunication.num2) {
				
			}
		}
	}

	public Suspect getSuspectWithMostPartners() {
		return null;
	}

	public PhoneCall getLongestPhoneCallBetween(String number1, String number2) {
		return null;
	}

	public ArrayList<SMS> getMessagesBetween(String number1, String number2) {
		return null;
	}

	public void printSuspectsFromCountry(String country) {
		
	}

}
