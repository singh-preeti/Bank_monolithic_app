package com.customer.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.customer.model.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	//
	List<Contact> list = List.of(
			new Contact(1L,"singhpreety217@gmail.com","Preety",101L),
			new Contact(2L,"Sumit217@gmail.com","Sumit",102));

	
	@Override
	public List<Contact> getContactsofCustomer(Long custId) {
		
		return list.stream().filter(contact -> contact .getCustId().equals(custId))
				.collect(Collectors.toList());
	}
	
	
	

}
