package com.sportyshoes.service;

import java.util.List;

import com.sportyshoes.model.Product;


public interface ProductService {
	
	List<Product> findByName(String name);
	
	public Product createProduct(Product product);
	
	public List<Product> getAllProduct();

}
