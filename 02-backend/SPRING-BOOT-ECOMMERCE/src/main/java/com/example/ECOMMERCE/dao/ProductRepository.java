package com.example.ECOMMERCE.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ECOMMERCE.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
	

}
