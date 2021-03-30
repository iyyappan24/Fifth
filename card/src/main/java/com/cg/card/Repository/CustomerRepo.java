package com.cg.card.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.card.Entity.Customer;
import com.cg.card.Entity.CustomerDetails;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    
	@Query("select cf from CustomerDetails cf join cf.c p where p.id = :d")
	CustomerDetails getMobile(@Param("d") int i);

}
