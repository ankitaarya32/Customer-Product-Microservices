package com.example.Customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Customer.model.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
