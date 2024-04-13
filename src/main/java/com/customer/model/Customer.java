package com.customer.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private Long custId;
	private String name;
	private String phone;
	
	List<Contact> contact = new ArrayList<>();
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(Long custId, String name, String phone, List<Contact> contact) {
		super();
		this.custId = custId;
		this.name = name;
		this.phone = phone;
		this.contact = contact;
	}


	public Customer(Long custId, String name, String phone) {
		super();
		this.custId = custId;
		this.name = name;
		this.phone = phone;
	}


	public Long getCustId() {
		return custId;
	}


	public List<Contact> getContact() {
		return contact;
	}


	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}


	public void setCustId(Long custId) {
		this.custId = custId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
}
