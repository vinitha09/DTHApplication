package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.CustomerProfile;
import com.demo.entity.Registration;
import com.demo.repository.CustomerProfileRepo;
import com.demo.repository.RegistrationRepo;
import com.demo.service.IRegistration;

@RestController
@RequestMapping("/register")
public class RegistrationController {

	
	
		@Autowired
		private IRegistration iRegistration;
	   
	    @GetMapping("/getall")
	    public List<Registration> getAllRegisters() {
	        return iRegistration.getAllRegisters();
	    }
	    
	    @PostMapping("/save")
	    public Registration createRegister(@RequestBody Registration registration) {
	        return iRegistration.saveRegister(registration);
	    }
	    
}


