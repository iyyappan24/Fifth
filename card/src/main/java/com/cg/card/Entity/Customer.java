package com.cg.card.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="customer")
public class Customer {
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	int id;
	
	@Column(name="Username")
	String name ;
	
	@Column(name="Password")
	String password ;
	
	@OneToOne(mappedBy="c", cascade=CascadeType.ALL)
	CustomerDetails d;
	
	public Customer(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@JsonManagedReference
	public CustomerDetails getD() {
		return d;
	}

	public void setD(CustomerDetails d) {
		this.d = d;
	}
	
	
	
	
}
