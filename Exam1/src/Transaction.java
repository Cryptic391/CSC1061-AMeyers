import java.time.LocalDate;

public class Transaction {
	private LocalDate transDate = LocalDate.now();
	private String transType;
	private double transAmount;
	private double newBalance;
	
	
	public Transaction(String transType, double transAmount, double newBalance) {
		super();
		this.transType = transType;
		this.transAmount = transAmount;
		this.newBalance = newBalance;
	}


	@Override
	public String toString() {
		return "Transaction Date = " + transDate + ", Transaction Type = " + transType + ", Transaction Amount = $" + transAmount
				+ ", New Balance = $" + newBalance + "\n";
	}
	
	
	

}
