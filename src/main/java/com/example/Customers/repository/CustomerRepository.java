package com.example.Customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customers.entity.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
