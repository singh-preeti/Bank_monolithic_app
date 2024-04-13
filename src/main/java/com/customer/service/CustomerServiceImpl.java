package com.customer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.customer.model.Customer;

@Service
public class CustomerServiceImpl implements Customerservice {
	
	//list of customer
	List<Customer> list = List.of(
			new Customer(101L,"John","8989788"),
			new Customer(102L,"Alice","7899665"));

	@Override
	public Customer getCutomer(Long id) {
		
		return this.list
				.stream()
				.filter(customer -> customer.getCustId().equals(id))
				.findAny()
				.orElse(null);
	}

}
