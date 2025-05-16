package com.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Address;
import com.demo.repository.AddressRepo;
import com.demo.service.IAddress;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AddressImpl implements IAddress {

  private final AddressRepo addressRepo;
  
  //save operation
  @Override 
  public Address saveAddress(Address address) { 
	 return addressRepo.save(address); 
  }
  
  //fetch operation
  @Override 
  public List<Address> getAllAddresses() { 
	
	  		return (List<Address>) addressRepo.findAll(); 
	 }
  
  
  
}