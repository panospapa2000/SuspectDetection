import java.util.ArrayList;

public class Suspect {
	
	private String realName;
	private String codeName;
	private String country;
	private String city;
	public ArrayList<String> Numbers = new ArrayList<String>();
	public ArrayList<Communication> comSusps = new ArrayList<Communication>();
	
	public Suspect(String rN, String uN, String count, String c) {
		realName = rN;
		codeName = uN;
		country = count;
		city = c;
	}

	public void addNumber(String number) {
		for(int i=0; i<Numbers.size(); i++) {
			Numbers.add(number);
		}
	}
	
	public void addcomSusps() {
		for(int i=0; i<comSusps.size(); i++) {
			
		}
	}

	public String getName() {
		return realName;
	}

	public String getCodeName() {
		return codeName;
	}

	public boolean isConnectedTo(Suspect s3) {
		boolean flag = false;
		
		return flag;
	}

	public ArrayList<Suspect> getCommonPartners(Suspect s3) {
		return null;
	}
}
