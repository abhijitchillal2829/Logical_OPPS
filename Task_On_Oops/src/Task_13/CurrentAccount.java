package Task_13;

public class CurrentAccount implements Accounts{

	@Override
	public void deposit(int Amount) {
		System.out.println("Deposit Amount From Current Account:" + Amount);
		
	}

	@Override
	public void withdraw(int withdrawcash) {
		System.out.println("Withdraw Cash From Current Account:" +withdrawcash);
		
	}

	@Override
	public void calculate_interest(int interest) {
		System.out.println("Interest Rate For Current Account:" + interest+"%");
		
	}

	@Override
	public void view_balance() {
		System.out.println("View balance method from Current account");
		
	}

}
