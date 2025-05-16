package com.demo.service;

import java.util.List;


import com.demo.entity.CustomerProfile;

public interface ICustomerProfile {
	CustomerProfile saveCustomerProfile(CustomerProfile customerProfile);
	List<CustomerProfile> getAllProfiles();
}
