package Task_13;

public interface Accounts {

	public void deposit(int Amount);
	
	public abstract void withdraw(int withdrawcash);
	
	public abstract void calculate_interest(int interest);
	
	public abstract void view_balance();
}
