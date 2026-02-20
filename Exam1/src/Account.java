import java.time.LocalDate;
import java.util.ArrayList;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private LocalDate dateCreated = LocalDate.now();
	private String name;
	private ArrayList<Transaction> transactions = new ArrayList<>();
	
	
	public Account() {
		super();
	}


	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	
	public Account(String name,int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	public LocalDate getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12);
	}
	
	public double getMonthlyInterest() {
		return (balance * (getMonthlyInterestRate() / 100));
	}
	
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	
	public void withdraw(double withdraw) {
		balance = balance - withdraw;
		getTransactions().add(new Transaction("Withdraw", withdraw, balance));
	}
	
	public void deposit(double deposit) {
		balance = balance + deposit;
		getTransactions().add(new Transaction("Deposit", deposit, balance));
	}
	
	private void printTransactions() {
		for(Transaction trans : transactions) {
			System.out.println(trans);
		}
		
	}


	@Override
	public String toString() {
		return "Account ID = " + id + ", Date Created = " + dateCreated + ", Balance = $" + balance + ", Monthly Interest = $" + getMonthlyInterest() + ", Transactions:\n" + transactions + "\n";
	}







	
}
