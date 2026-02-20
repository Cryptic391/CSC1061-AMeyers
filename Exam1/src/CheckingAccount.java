
public class CheckingAccount extends Account{
	private double overdraftLimit;

	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	public CheckingAccount(String name, int id, double balance, double overdraftLimit) {
		super(name, id, balance);
		this.overdraftLimit = overdraftLimit;
	}


	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	public void withdraw(double withdraw) {
		if((this.getBalance() - withdraw) < (0-overdraftLimit)) {
			System.out.println("Cannot overdraft this account.");			
		}
		else
			setBalance(getBalance() - withdraw);
		getTransactions().add(new Transaction("Withdraw", withdraw, getBalance()));
	}

	
	

}
