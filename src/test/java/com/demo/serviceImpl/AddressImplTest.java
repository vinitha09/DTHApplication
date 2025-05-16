package com.demo.serviceImpl;

import com.demo.Enum.enums;
import com.demo.Enum.enums.*;
import com.demo.entity.Address;
import com.demo.repository.AddressRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AddressImplTest {

	    @Mock
	    private AddressRepo addressRepo;

	    @InjectMocks
	    private AddressImpl addressImpl;

	    @Test
	    void saveAddress_ShouldSaveSuccessfully() {
	      
	        Address address = new Address();
	        address.setAddressID(1);
	        address.setState(State.TELANGANA);
	        address.setCountry(Country.India);
	        
	        when(addressRepo.save(address)).thenReturn(address);
	        
	        Address savedAddress = addressImpl.saveAddress(address);
	        
	        assertEquals(1, savedAddress.getAddressID());
	        assertEquals(State.TELANGANA, savedAddress.getState());
	        assertEquals(Country.India, savedAddress.getCountry());
	        
	        verify(addressRepo, times(1)).save(address);
	    }
	    
	    @Test
	    void getAllAddresses_ShouldReturnList() {
	      
	        Address address1 = new Address();
	        address1.setAddressID(1);
	        address1.setState(State.TELANGANA);
	        address1.setCountry(Country.India);
	   
	        Address address2 = new Address();
	        address2.setAddressID(2);
	        address2.setState(State.ANDHRA_PRADESH);
	        address2.setCountry(Country.India);
	        

	        List<Address> mockList = Arrays.asList(address1, address2);

	        when(addressRepo.findAll()).thenReturn(mockList);

	       
	        List<Address> result = addressImpl.getAllAddresses();

	       
	        assertEquals(2, result.size());
	        assertEquals(State.TELANGANA, result.get(0).getState());
	        assertEquals(State.ANDHRA_PRADESH, result.get(1).getState());

	        verify(addressRepo, times(1)).findAll();
	    }
	}