package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;
import com.repository.ProductRepository;

@Service
public class ProductServiceIMPL implements ProductService{
	
	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> getAllProducts() {
		
		return repository.findAll();
	}

	@Override
	public Optional<Product> getProductById(int productId) {
				return repository.findById(productId);
	}

}
