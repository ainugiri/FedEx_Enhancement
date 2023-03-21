package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CouponModel;

public interface CouponRepo extends JpaRepository<CouponModel, String>{

}
