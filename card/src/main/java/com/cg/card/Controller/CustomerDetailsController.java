package com.cg.card.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.card.Entity.CustomerDetails;
import com.cg.card.Service.CustomerDetailsService;

@RestController
@RequestMapping("/custom")
public class CustomerDetailsController {

	@Autowired
	CustomerDetailsService ser;
	
	@PostMapping("/ad")
	public ResponseEntity<Object> addData(@RequestBody CustomerDetails cd){
		CustomerDetails sd =null;
	    sd = ser.ad(cd);
		return new ResponseEntity<>(sd,HttpStatus.OK);
	}
}
