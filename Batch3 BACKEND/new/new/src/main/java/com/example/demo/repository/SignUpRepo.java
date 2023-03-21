package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SignUpModel;

public interface SignUpRepo extends JpaRepository<SignUpModel, Long> {

}
