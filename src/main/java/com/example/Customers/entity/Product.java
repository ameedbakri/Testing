package com.example.Customers.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {

	@Id
	private Integer pid;
	private String productName;
	private Integer qty;
	private Integer price;
	
}
