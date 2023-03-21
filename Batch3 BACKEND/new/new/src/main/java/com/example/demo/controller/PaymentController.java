package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PaymentModel;
import com.example.demo.repository.PaymentRepo;

@CrossOrigin(origins = "null", allowedHeaders = "*")
@RestController
@RequestMapping("/payment")
public class PaymentController {
	@Autowired
    private PaymentRepo paymentRepo;
	@PostMapping("/payment")
	public PaymentModel createPayment(@RequestBody PaymentModel Payment){
		return paymentRepo.save(Payment);
	}
    }
