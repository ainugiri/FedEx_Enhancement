package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.OrderModel;
import com.example.demo.repository.OrderRepo;

@CrossOrigin(origins = "null", allowedHeaders = "*")
@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
    private OrderRepo orderRepo;
	@PostMapping("/order")
    public OrderModel createOrder(@RequestBody OrderModel add) {
		return orderRepo.save(add);
    }
}
