package com.cg.card.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.card.Entity.Customer;
import com.cg.card.Entity.CustomerDetails;
import com.cg.card.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	CustomerService service ;
	
	@Autowired
	public CustomerController(CustomerService s) {
		this.service = s;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Object> addCustomer(@RequestBody Customer cs){	
		Customer cus=null;
		cus = service.add(cs);
		return new ResponseEntity<>(cus,HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> get(@PathVariable("id") int id){
		
		CustomerDetails cg = service.get(id);
		String ph = cg.getMobileno();
		return new ResponseEntity<>("mobile number : "+ph,HttpStatus.OK);
	}
}
