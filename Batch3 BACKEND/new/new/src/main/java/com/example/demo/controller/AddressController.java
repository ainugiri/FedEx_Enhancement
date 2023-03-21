package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AddressModel;
import com.example.demo.repository.AddressRepo;

@CrossOrigin(origins = "null", allowedHeaders = "*")
@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
    private AddressRepo addressRepo;
	@PostMapping("/user_address")
    public AddressModel AdduserAddress(@RequestBody AddressModel userAddress) {
        return addressRepo.save(userAddress);
    }
	
}
