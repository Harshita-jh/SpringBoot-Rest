package com.boot.springbootrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.boot.springbootrest.entity.Product;

@Service
public class ProductService implements IProductService {
	@Override
	public List<Product> findAll() {
		
		//creating an object of ArrayList  
		ArrayList<Product> products = new ArrayList<Product>();
		
		//adding products to the List  
		products.add(new Product(100, "Mobile", 9000.00, 6));
		products.add(new Product(101, "Smart TV", 60000.00, 3));
		products.add(new Product(102, "Washing Machine", 9000.00, 7));
		products.add(new Product(103, "Laptop", 24000.00, 1));
		products.add(new Product(104, "Air Conditioner", 30000.00, 5));
		products.add(new Product(105, "Refrigerator ", 10000.00, 4));
		
		//returns a list of product  
		return products;
	}
}
