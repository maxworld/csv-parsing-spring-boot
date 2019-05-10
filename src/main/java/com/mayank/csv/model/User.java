package com.mayank.csv.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	private int id;

	@Column
	private String name;

	@Column
	private String address;

	@Column
	private String contactNumber;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", contactNumber=" + contactNumber
				+ "]";
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String name, String address, String contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
	}

}
