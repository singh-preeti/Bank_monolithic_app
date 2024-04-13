package com.customer.service;

import java.util.List;

import com.customer.model.Contact;
import com.customer.model.Customer;

public interface ContactService {

	public List<Contact> getContactsofCustomer(Long custId);
}
