package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.OrderModel;

public interface OrderRepo extends JpaRepository<OrderModel, Integer>{

}
