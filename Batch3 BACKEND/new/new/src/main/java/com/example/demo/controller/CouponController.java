package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CouponModel;
import com.example.demo.repository.CouponRepo;

@CrossOrigin(origins = "null", allowedHeaders = "*")
@RestController
@RequestMapping("/coupon")
public class CouponController {
	@Autowired
	  private CouponRepo couponRepo;
		@PostMapping("/addcoupon")
		public CouponModel createCoupon(@RequestBody CouponModel addcoupon){
			return couponRepo.save(addcoupon);
		}
		
		@GetMapping("/getcoupon/{couponCode}")  
		private CouponModel getCoupon(@PathVariable("couponCode") String couponId)   
		{  
			Date today = new Date();               
			CouponModel couponModel = couponRepo.findById(couponId).get();
			if(couponModel.getCoupon_Name() == null) {
				//couponModel.setStatus("invalid coupon");
				return couponModel;
			}
//			else if(today.compareTo(couponModel.getValidityDate())<0) { 
//				//couponModel.setStatus("invalid Date");
//				return couponModel;
//			}
			return couponModel;
		}  
}