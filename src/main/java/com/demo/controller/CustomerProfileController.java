package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.CustomerProfile;
import com.demo.service.ICustomerProfile;


@RestController
@RequestMapping("/customer")
public class CustomerProfileController {

	
	
		@Autowired
		private ICustomerProfile iCustomerProfile;
	   
	    @GetMapping("/getall")
	    public List<CustomerProfile> getAllProfiles() {
	        return iCustomerProfile.getAllProfiles();
	    }
	    
	    @PostMapping("/save")
	    public CustomerProfile saveCustomerProfile(@RequestBody CustomerProfile customerProfile) {
	        return iCustomerProfile.saveCustomerProfile(customerProfile);
	    }
	    
}

