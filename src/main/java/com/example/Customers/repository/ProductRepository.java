package com.example.Customers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customers.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
