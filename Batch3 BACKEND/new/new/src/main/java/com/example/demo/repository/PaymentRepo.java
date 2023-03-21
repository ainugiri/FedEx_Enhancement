package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PaymentModel;

public interface PaymentRepo extends JpaRepository<PaymentModel, Integer>{

}
