/**
 *The Constructor that every class is based on
 *
 * Copyright (c) 2026 Austin Meyers
 *@author Austin Meyers
 *@version 1
 */

/**
 * The Constructor for all Peoples
 */
public class Person {
	private String name;
	private String address;
	private String phoneNum;
	private String email;
	
	/**
	 * 
	 * @param name
	 * @param address
	 * @param phonenum
	 * @param email
	 */
	public Person(String name, String address, String phonenum, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNum = phonenum;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenum() {
		return phoneNum;
	}

	public void setPhonenum(String phonenum) {
		this.phoneNum = phonenum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Name=" + name + ", Address=" + address + ", Phone Number=" + phoneNum + ", Email=" + email + "]";
	}
	
	
	
}
