/**
 * The Constructor for all students
 * 
 * Copyright (c) 2026 Austin Meyers
 *@author Austin Meyers
 *@version 1
 */

/**
 * The Constructor for all Students
 */
public class Student extends Person{
	private String status;
	/**
	 * The Constructor for all students
	 * @param name
	 * @param address
	 * @param phonenum
	 * @param email
	 * @param status
	 */
	public Student(String name, String address, String phonenum, String email, String status) {
		super(name, address, phonenum, email);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [Status=" + status + ", " + super.toString();
	}
	
	
	
}
