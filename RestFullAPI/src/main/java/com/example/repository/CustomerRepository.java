package com.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	@Query("select x from Customer x order by x.firstName, x.lastName")
	//List<Customer> findAllOrderByName();
	Page<Customer> findAllOrderByName(Pageable pageable);
}
