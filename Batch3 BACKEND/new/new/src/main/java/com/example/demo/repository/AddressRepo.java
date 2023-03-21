package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.AddressModel;

public interface AddressRepo extends JpaRepository<AddressModel, Integer> {

}
