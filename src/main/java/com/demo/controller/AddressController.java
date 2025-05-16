package com.demo.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Address;

import com.demo.service.IAddress;


@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
	private final IAddress iAddress;

    @GetMapping("/getall")
    public List<Address> getAllAddresses() {
        return iAddress.getAllAddresses();
    }
    
    @PostMapping("/save")
    public Address saveAddress(@RequestBody Address address) {
        return iAddress.saveAddress(address);
    }
   
}
