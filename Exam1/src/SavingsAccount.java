
public class SavingsAccount extends Account{
	private double minBalance;

	public SavingsAccount(int id, double balance, double minBalance) {
		super(id, balance);
		this.minBalance = minBalance;
	}
	
	

	public SavingsAccount(String name, int id, double balance, double minBalance) {
		super(name, id, balance);
		this.minBalance = minBalance;
	}



	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	
	@Override
	public void withdraw(double withdraw) {
		if(getBalance()-withdraw < minBalance) {
			System.out.println("Cannot withdraw more than " + minBalance);
		}
		else
			setBalance(getBalance() - withdraw);
		getTransactions().add(new Transaction("Withdraw", withdraw, getBalance()));
	}

}
