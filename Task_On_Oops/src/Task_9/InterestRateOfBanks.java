package Task_9;

public class InterestRateOfBanks {

	public static void main(String[] args) {
		
		double interest = 100;
	
		Bank sbi = new SBI();
		System.out.println("InterestRate from SBI :" +sbi.RateOfInterest(interest));

		Bank icici = new ICICI();
		System.out.println("InterestRate from ICICI :" +icici.RateOfInterest(interest));
		
		Bank axis = new AXIS();
		System.out.println("InterestRate from AXIS :" +axis.RateOfInterest(interest));
	}

}
