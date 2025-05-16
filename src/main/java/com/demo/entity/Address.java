package com.demo.entity;

import com.demo.Enum.enums.State;
import com.demo.Enum.enums.Country;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "Address")
public class Address {
	@Id
	private int addressID;
	private String city;
	private Country country;
	private String houseNumber;
	private int pincode;
	private State state;
	private String street;

}
