
public class CommissionEmployee extends Employee{
	private int grossSales;
	private double commissionRate;
	
	
	public CommissionEmployee(String firstName, String lastName, long ssn, int grossSales, double commissionRate) {
		super(firstName, lastName, ssn);
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}


	public int getGrossSales() {
		return grossSales;
	}


	public void setGrossSales(int grossSales) {
		this.grossSales = grossSales;
	}


	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	@Override
	double getPaymentAmount() {
		return (grossSales * commissionRate);
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nPayment Amount: $" + getPaymentAmount();
	}
	
	
	
	
}
