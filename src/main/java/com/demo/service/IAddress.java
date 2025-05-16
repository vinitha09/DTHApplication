package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Address;

import lombok.RequiredArgsConstructor;

@Service

public interface IAddress {
	Address saveAddress(Address address);
	List<Address> getAllAddresses();
	
		
	

}
