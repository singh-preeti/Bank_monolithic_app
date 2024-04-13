package com.customer.model;

public class Contact {
	
	private Long contId;
	private String email;
	private String contactName;
	
	private Long custId;

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Long contId, String email, String contactName, Long custId) {
		super();
		this.contId = contId;
		this.email = email;
		this.contactName = contactName;
		this.custId = custId;
	}

	public Long getContId() {
		return contId;
	}

	public void setContId(Long contId) {
		this.contId = contId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	
}
