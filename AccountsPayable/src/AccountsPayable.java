import java.sql.Array;
import java.util.Scanner;

public class AccountsPayable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Employee[] payableEmployees = new Employee[6];
		
		/*
		 * Test Employees
		 */
//		payableEmployees[0] = new SalariedEmployee("One", "First", 1, 100);
//		payableEmployees[1] = new CommissionEmployee("Two", "Second", 2, 200, 201);
//		payableEmployees[2] = new HourlyEmployee("Three", "Third", 3, 40.0, 300);
//		payableEmployees[3] = new HourlyEmployee("Four", "Fourth", 4, 40.0, 400);
//		payableEmployees[4] = new BasePlusCommisionEmployee("Five", "Fifth", 5, 500, 501, 502);
//		payableEmployees[5] = new SalariedEmployee("Six", "Sixth", 6, 600);
		
		/*
		 * User input employees
		 */
		for(int i = 0; i < 6; i++) {
			System.out.println("Enter type of employee. (Salaried, Commission, Hourly, or Base)");
			String type = input.next();
			
			System.out.println("Enter first name of employee:");
			String firstName = input.next();
			
			System.out.println("Enter last name of employee:");
			String lastName = input.next();
			
			System.out.println("Enter the Social Security Number of the Employee");
			long ssn = input.nextLong();
			
			
			if(type.equals("Salaried")) {
				System.out.println("Enter Salaried Employee weekly pay:");
				double weeklyPay = input.nextDouble();
				payableEmployees[i] = new SalariedEmployee(firstName, lastName, ssn, weeklyPay);
			}
			else if(type.equals("Commission")) {
				System.out.println("Enter Commission Employee gross sales:");
				int grossSales = input.nextInt();
				System.out.println("Enter Commission Employee commission rate:");
				double commissionRate = input.nextDouble();
				payableEmployees[i] = new CommissionEmployee(firstName, lastName, ssn, grossSales, commissionRate);
			}
			else if(type.equals("Hourly")) {
				System.out.println("Enter Hourly Employee hours worked:");
				double hours = input.nextDouble();
				System.out.println("Enter Hourly Employee hourly pay:");
				double hourlyPay = input.nextDouble();
				payableEmployees[i] = new HourlyEmployee(firstName,lastName,ssn,hours,hourlyPay);
			}
			else if(type.equals("Base")) {
				System.out.println("Enter Base Commission Employee gross sales:");
				int grossSales = input.nextInt();
				System.out.println("Enter Base Commission Employee commission rate:");
				double commissionRate = input.nextDouble();
				System.out.println("Enter Base Commission Employee base pay:");
				double basePay = input.nextDouble();
				payableEmployees[i] = new BasePlusCommisionEmployee(firstName,lastName,ssn,grossSales,commissionRate,basePay);
			}
			
			
		}
		
		/*
		 * Base employee printer
		 */
		for(int i = 0; i < payableEmployees.length; i++) {
			printEmployee(payableEmployees[i]);
			System.out.println();
		}
		
		/*
		 * Base Commission Employee base pay increase by 10%
		 */
		for(int i = 0; i < payableEmployees.length; i++) {
			if(payableEmployees[i] instanceof BasePlusCommisionEmployee) {
				((BasePlusCommisionEmployee)payableEmployees[i]).setBaseSalary((((BasePlusCommisionEmployee)payableEmployees[i]).getBaseSalary() * 1.1));;
			}
			printEmployee(payableEmployees[i]);
			System.out.println();
		}
		
		/*
		 * Only name and pay amount printer
		 */
		for(int i = 0; i < payableEmployees.length; i++) {
			System.out.println(payableEmployees[i].getFirstName() + " " + payableEmployees[i].getLastName() + ", Payment Amount: $" + payableEmployees[i].getPaymentAmount());
			
		}
		
		
		
	}
	/*
	 * Employee printer with toString
	 */
	public static void printEmployee(Employee input) {
		System.out.println(input);
	}
	
	/*
	 * Employee printer without toString
	 */
	public static void longPrintEmployee(Employee input) {
		System.out.println("First Name: " + input.getFirstName());
		System.out.println("Last Name: " + input.getLastName());
		System.out.println("Social Security Number: " + input.getSsn());
		System.out.println("Payment Amount: $" + input.getPaymentAmount());
		}
	}

