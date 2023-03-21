package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SignUpModel;
import com.example.demo.repository.SignUpRepo;
@CrossOrigin(origins = "null", allowedHeaders = "*")
@RestController
@RequestMapping("/api")
public class SignUpController {
	@Autowired
    private SignUpRepo signUpRepo;
	@PostMapping("/user")
    public SignUpModel createEmployee(@RequestBody SignUpModel user) {
        return signUpRepo.save(user);
    }
	
	@GetMapping("/login")
    public List<SignUpModel> checkUser() {
        return signUpRepo.findAll();
    }
	//@Autowired
    //private AddressRepo addressRepo;
	//@PostMapping("/user-address")
    //public AddressModel AdduserAddress(@RequestBody AddressModel useraddress) {
		//System.out.println(useraddress);
        //return addressRepo.save(useraddress);
    //}
}
