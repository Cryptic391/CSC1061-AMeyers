
public class HourlyEmployee extends Employee{
	private int hours;
	private double hourlyWage;
	
	
	public HourlyEmployee(String firstName, String lastName, long ssn, int hours, double hourlyWage) {
		super(firstName, lastName, ssn);
		this.hours = hours;
		this.hourlyWage = hourlyWage;
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
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
