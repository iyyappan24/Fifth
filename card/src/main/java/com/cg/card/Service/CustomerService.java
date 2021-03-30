package com.cg.card.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.card.Entity.Customer;
import com.cg.card.Entity.CustomerDetails;
import com.cg.card.Repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo re ;
	
	public Customer add(Customer cs) {
		Customer c =re.saveAndFlush(cs);
		c.getD().setC(c);     //linking
	    
		re.saveAndFlush(c);
		return c;
	}
    
	public CustomerDetails get(int id) {
		CustomerDetails f = re.getMobile(id);
		return f;
	}
}
