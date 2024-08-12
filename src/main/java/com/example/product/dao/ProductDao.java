package com.example.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.product.entity.Product;
import com.example.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;
	public String postProduct(List<Product> a) {
		pr.saveAll(a);
		return "posted successfully";
	}
	 public List<Product> getall() {
    	 return pr.findAll();
     }

}
