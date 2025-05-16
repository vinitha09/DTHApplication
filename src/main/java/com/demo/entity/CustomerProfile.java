package com.demo.entity;

import com.demo.Enum.enums.Gender;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "CustomerProfile")
public class CustomerProfile {
	private Address address;
	@Id
    private int customerProfileID;
    private int alterPhoneNumber;
    private String email;
    private String firstName;
    private String lastName;
    private Gender gender;
    private int phoneNumber;
    private String profilePic;

    
    
    
}
