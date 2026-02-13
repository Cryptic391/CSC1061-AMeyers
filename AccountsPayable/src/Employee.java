
public class Employee {
	private String firstName;
	private String lastName;
	private long ssn;
	
	
	public Employee() {
		
	}


	public Employee(String firstName, String lastName, long ssn) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.ssn = ssn;
	}

	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public long getSsn() {
		return ssn;
	}


	public void setSsn(long ssn) {
		this.ssn = ssn;
	}


	double getPaymentAmount() {
		return 0;
	}


	@Override
	public String toString() {
		return "First Name: " + firstName + "\nLast Name: " + lastName + "\nSocial Security Number: " + ssn;
	}
		
		

}
