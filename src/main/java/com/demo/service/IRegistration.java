package com.demo.service;

import java.util.List;


import com.demo.entity.Registration;

public interface IRegistration {
	Registration saveRegister(Registration registration);
	List<Registration> getAllRegisters();
}
