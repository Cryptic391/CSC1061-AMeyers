/**
 * The Constructor that every Employee is based on
 * 
 * Copyright (c) 2026 Austin Meyers
 *@author Austin Meyers
 *@version 1
 */

/**
 * The Constructor for all Employees
 */
public class Employee extends Person{
	private String office;
	private String salary;
	private String hireDate;
	
	/**
	 * The Constructor that every Employee is based on
	 * @param name
	 * @param address
	 * @param phonenum
	 * @param email
	 * @param office
	 * @param salary
	 * @param hireDate
	 */
	public Employee(String name, String address, String phonenum, String email, String office, String salary,
			String hireDate) {
		super(name, address, phonenum, email);
		this.office = office;
		this.salary = salary;
		this.hireDate = hireDate;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	@Override
	public String toString() {
		return ", Office=" + office + ", Salary=" + salary + ", Hire Date=" + hireDate + ", "
				+ super.toString() + "]";
	}
	
	
	
}
