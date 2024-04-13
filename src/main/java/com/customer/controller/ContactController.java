package com.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Contact;
import com.customer.service.ContactService;

@RestController
@RequestMapping("/contact")
public class ContactController {
	
	@Autowired
	private ContactService contactservice;
	
	@GetMapping("/cust/{custId}")
	public List<Contact> getContact(@PathVariable("custId") Long custId)
	{
		return this.contactService.getContactsofCustomer(custId);
	}

}
