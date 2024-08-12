package com.example.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.product.dao.ProductDao;
import com.example.product.entity.Product;

@Service
public class ProductService {
@Autowired
ProductDao pd;
public String postProduct(List<Product> a) {
	return pd.postProduct(a);
}
public List<Product> getall() {
	 return pd.getall();
}

}
