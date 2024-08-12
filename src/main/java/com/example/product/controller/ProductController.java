package com.example.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.entity.Product;
import com.example.product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService ps;

	@PostMapping(value = "/post")
	public String postProduct(@RequestBody List<Product> a) {
		return ps.postProduct(a);
	}
     @GetMapping(value="/getAll")
     public List<Product> getall() {
    	 return ps.getall();
     }
}
