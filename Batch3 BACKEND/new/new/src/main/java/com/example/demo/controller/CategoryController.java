package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CategoryModel;
import com.example.demo.repository.CategoryRepo;
@CrossOrigin(origins = "null", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class CategoryController {
	@Autowired
    private CategoryRepo categoryRepo;
	@PostMapping("/category")
	public CategoryModel createCategory(@RequestBody CategoryModel Category){
		return categoryRepo.save(Category);
	}
}
