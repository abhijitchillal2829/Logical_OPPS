package Task_13;

public class SavingsAccount implements Accounts {

	@Override
	public void deposit(int Amount) {
		System.out.println("Deposit from Saving Account:" + Amount);
		
	}

	@Override
	public void withdraw(int withdrawcash) {
		System.out.println("Withdraw Cash From Saving Account:" +withdrawcash);
		
	}

	@Override
	public void calculate_interest(int interest) {
		System.out.println("Interest Rate for Saving Account:" + interest+"%");
		
	}

	@Override
	public void view_balance() {
		System.out.println("View balance method from Saving Account");
		
	}

}
