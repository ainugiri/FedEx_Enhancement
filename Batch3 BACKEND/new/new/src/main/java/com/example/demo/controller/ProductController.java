package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ProductModel;
import com.example.demo.repository.ProductRepo;

@CrossOrigin(origins = "null", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class ProductController {
	@Autowired
  private ProductRepo productRepo;
	@PostMapping("/product")
	public ProductModel createProduct(@RequestBody ProductModel Product){
		return productRepo.save(Product);
	}
}


