package com.cg.card.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="customer_details")
public class CustomerDetails {
    @Id
    @Column(name="Mobileno")
	String mobileno;
	
	@Column(name="Address")
	String address;
	
	@Column(name="Pincode")
	String pincode;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Customer_id")
	Customer c ;
	
	public CustomerDetails() {
		
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
    
	@JsonBackReference
	public Customer getC() {
		return c;
	}

	public void setC(Customer c) {
		this.c = c;
	}


	
	
}
