package p0701;

public class SmartPhone {
	private String company;
	private String os;
	
	SmartPhone(String company, String os){
		this.company = company;
		this.os = os;
	}

	@Override
	public String toString() {
		return "SmartPhone [company=" + company + ", os=" + os + "]";
	}	
}