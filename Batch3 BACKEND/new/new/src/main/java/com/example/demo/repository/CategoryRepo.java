package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CategoryModel;

public interface CategoryRepo extends JpaRepository<CategoryModel, Integer>{

}
