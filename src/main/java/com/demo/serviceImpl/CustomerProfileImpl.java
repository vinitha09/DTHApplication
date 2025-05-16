package com.demo.serviceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import com.demo.entity.CustomerProfile;
import com.demo.repository.CustomerProfileRepo;
import com.demo.service.ICustomerProfile;
@Service
@RequiredArgsConstructor
public class CustomerProfileImpl implements ICustomerProfile {
	

	private final CustomerProfileRepo customerProfileRepo;
	
	 //save operation
	  @Override 
	  public CustomerProfile saveCustomerProfile(CustomerProfile customerProfile) { 
		 return customerProfileRepo.save(customerProfile); 
		 }
	  
	  //fetch operation
	  @Override 
	  public List<CustomerProfile> getAllProfiles() { 
		
		  		return (List<CustomerProfile>) customerProfileRepo.findAll(); 
		 }
	  
	  
}
