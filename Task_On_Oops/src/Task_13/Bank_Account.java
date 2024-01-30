package Task_13;

public class Bank_Account {

	public static void main(String[] args) {
		
		Accounts savingaccount = new SavingsAccount();
		savingaccount.deposit(100000);
		savingaccount.withdraw(50000);
		savingaccount.calculate_interest(7);
		savingaccount.view_balance();
	
		System.out.println();
		
		Accounts currentaccount = new CurrentAccount();
		currentaccount.deposit(1000000);
		currentaccount.withdraw(500000);
		currentaccount.calculate_interest(8);
		currentaccount.view_balance();

	}

}
