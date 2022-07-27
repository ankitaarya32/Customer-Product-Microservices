package com.example.Customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.Customer.model.Customer;
import com.example.Customer.repository.CustomerRepository;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {
	@Autowired
	private CustomerRepository crepo;

	@PostMapping
	public void addCustomer(@RequestBody Customer customer) {
		crepo.save(customer);
	}
	
	@GetMapping
	public List<Customer> getAllCustomer(){
		return crepo.findAll();
	}
	@GetMapping(path = "{customerId}")
	public Customer getCustomerById(@PathVariable Integer customerId){
		return crepo.findById(customerId).get();
	}
}
