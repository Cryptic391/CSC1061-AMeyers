
public class SalariedEmployee extends Employee{
	private double weeklySalary;

	
	public SalariedEmployee(String firstName, String lastName, long ssn, double weeklySalary) {
		super(firstName, lastName, ssn);
		this.weeklySalary = weeklySalary;
	}


	public double getWeeklySalary() {
		return weeklySalary;
	}


	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	
	@Override
	double getPaymentAmount() {
		return weeklySalary;
	}

	@Override
	public String toString() {
		return super.toString() + "\nPayment Amount: $" + getPaymentAmount();
	}
	
	
	
	
	
	
}
