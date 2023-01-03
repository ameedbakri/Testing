package com.example.Customers.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customers.dto.OrderRequest;
import com.example.Customers.entity.Customer;
import com.example.Customers.repository.CustomerRepository;
import com.example.Customers.repository.ProductRepository;

@RestController
public class OrderController {

	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private ProductRepository productRepo;
	
	@PostMapping("/placeOrder")
	public Customer PlaceOrder(@RequestBody OrderRequest request)
	{
		return customerRepo.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders()
	{
		return customerRepo.findAll();
	}
	
	
	
	
	
}
