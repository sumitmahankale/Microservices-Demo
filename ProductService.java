package com.service;

import java.util.List;
import java.util.Optional;

import com.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Optional<Product> getProductById(int productId);

}
