/**
 * The Constructor for all Faculty
 * 
 * Copyright (c) 2026 Austin Meyers
 *@author Austin Meyers
 *@version 1
 */

/**
 * Constructor for all Faculty
 */
public class Faculty extends Employee{
	private String officeHours;
	private String rank;
	/**
	 * The Constructor for all Faculty
	 * @param name
	 * @param address
	 * @param phonenum
	 * @param email
	 * @param office
	 * @param salary
	 * @param hireDate
	 * @param officeHours
	 * @param rank
	 */
	public Faculty(String name, String address, String phonenum, String email, String office, String salary,
			String hireDate, String officeHours, String rank) {
		super(name, address, phonenum, email, office, salary, hireDate);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Faculty [Office Hours=" + officeHours + ", Rank=" + rank + super.toString();
	}
	
	
	
	
}

