package com.cg.card.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.card.Entity.CustomerDetails;
import com.cg.card.Repository.CustomerDetailsRepo;

@Service
public class CustomerDetailsService {
	
	@Autowired
	CustomerDetailsRepo repo ;
	
	public CustomerDetails ad(CustomerDetails cd){
		CustomerDetails cf = repo.saveAndFlush(cd);
		cf.getC().setD(cf);
		CustomerDetails cc =repo.saveAndFlush(cf);
		return cc;
	}
	
	

}
