package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Customer;
import com.customer.service.Customerservice;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private Customerservice custservice;
	
	@GetMapping("/{custId}")
	public Customer getCustomer(@PathVariable Long custId) {
		return this.custservice.getCutomer(custId);
	}

}
