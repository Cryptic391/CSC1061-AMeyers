/**
 * 
 * 
 * Copyright (c) 2026 Austin Meyers
 *@author Austin Meyers
 *@version 1
 */

/**Constructor for all staff
 * 
 */
public class Staff extends Employee{
	private String title;

	/**
	 * 
	 * @param name
	 * @param address
	 * @param phonenum
	 * @param email
	 * @param office
	 * @param salary
	 * @param hireDate
	 * @param title
	 */
	public Staff(String name, String address, String phonenum, String email, String office, String salary,
			String hireDate, String title) {
		super(name, address, phonenum, email, office, salary, hireDate);
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff [Title=" + title + super.toString();
	}
	
	
}
