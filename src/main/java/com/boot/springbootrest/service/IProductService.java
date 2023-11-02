package com.boot.springbootrest.service;

import java.util.List;

import com.boot.springbootrest.entity.Product;

// Create an interface with the name IProductService and define the findAll() method that returns a List of products.
public interface IProductService {
	List<Product> findAll();
}