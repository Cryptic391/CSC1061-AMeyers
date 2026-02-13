import java.sql.Array;

public class AccountsPayable {

	public static void main(String[] args) {
		Employee[] payableEmployees = new Employee[6];
		
		payableEmployees[0] = new SalariedEmployee("One", "First", 1, 100);
		payableEmployees[1] = new CommissionEmployee("Two", "Second", 2, 200, 201);
		payableEmployees[2] = new HourlyEmployee("Three", "Third", 3, 40, 300);
		payableEmployees[3] = new HourlyEmployee("Four", "Fourth", 4, 40, 400);
		payableEmployees[4] = new BasePlusCommisionEmployee("Five", "Fifth", 5, 500, 501, 502);
		payableEmployees[5] = new SalariedEmployee("Six", "Sixth", 6, 600);
	}
	
	public void printEmployee(Employee input) {
		input.toString();
	}
	
	public void longPrintEmployee(Employee input) {
		input.getFirstName();
		input.getLastName();
		input.getSsn();
		if(input instanceof SalariedEmployee) {
			((SalariedEmployee)input).getWeeklySalary();
		}
		else if(input instanceof CommissionEmployee) {
			((CommissionEmployee)input).getGrossSales();
			((CommissionEmployee)input).getCommissionRate();
		}
		else if(input instanceof HourlyEmployee) {
			((HourlyEmployee)input).getHourlyWage();
			((HourlyEmployee)input).getHours();
		}
		else if(input instanceof SalariedEmployee) {
			((SalariedEmployee)input).getWeeklySalary();
		}
	}

}
