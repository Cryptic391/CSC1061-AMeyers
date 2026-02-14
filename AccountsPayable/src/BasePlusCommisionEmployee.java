
public class BasePlusCommisionEmployee extends CommissionEmployee{
	private double baseSalary;

	public BasePlusCommisionEmployee(String firstName, String lastName, long ssn, int grossSales, double commissionRate,
			double basePay) {
		super(firstName, lastName, ssn, grossSales, commissionRate);
		this.baseSalary = basePay;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double basePay) {
		this.baseSalary = basePay;
	}
	
	@Override
	double getPaymentAmount() {
		return (baseSalary + super.getPaymentAmount());
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
