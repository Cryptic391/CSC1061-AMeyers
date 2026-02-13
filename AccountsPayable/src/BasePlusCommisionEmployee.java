
public class BasePlusCommisionEmployee extends CommissionEmployee{
	private double basePay;

	public BasePlusCommisionEmployee(String firstName, String lastName, long ssn, int grossSales, double commissionRate,
			double basePay) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.basePay = basePay;
	}

	public double getBasePay() {
		return basePay;
	}

	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	
	@Override
	double getPaymentAmount() {
		return (basePay + getCommissionRate());
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nPayment Amount: $" + getPaymentAmount();
	}
	
	

}
