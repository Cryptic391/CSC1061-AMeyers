
public class HourlyEmployee extends Employee{
	private double hours;
	private double hourlyWage;
	
	
	public HourlyEmployee(String firstName, String lastName, long ssn, double hours, double hourlyWage) {
		super(firstName, lastName, ssn);
		this.hours = hours;
		this.hourlyWage = hourlyWage;
	}


	public double getHours() {
		return hours;
	}


	public void setHours(double hours) {
		this.hours = hours;
	}


	public double getHourlyWage() {
		return hourlyWage;
	}


	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	
	@Override
	double getPaymentAmount() {
		return (hours * hourlyWage);
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\nPayment Amount: $" + getPaymentAmount();
	}
	
	
	
}
