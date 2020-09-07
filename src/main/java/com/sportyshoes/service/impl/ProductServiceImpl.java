package com.sportyshoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportyshoes.model.Product;
import com.sportyshoes.repository.ProductRepository;
import com.sportyshoes.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> findByName(String name) {
		
		return repository.findByName(name);
	}

	@Override
	public Product createProduct(Product product) {
		
		return repository.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		
		return repository.findAll();
	}

}
