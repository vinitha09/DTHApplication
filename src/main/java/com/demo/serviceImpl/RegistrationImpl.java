package com.demo.serviceImpl;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Registration;
import com.demo.repository.RegistrationRepo;
import com.demo.service.IRegistration;
@RequiredArgsConstructor
@Service
public class RegistrationImpl implements IRegistration {

	private final RegistrationRepo registrationRepo;

	@Override
	public Registration saveRegister(Registration registration) {
		// TODO Auto-generated method stub
		 return registrationRepo.save(registration);
		
	}

	@Override
	public List<Registration> getAllRegisters() {
		// TODO Auto-generated method stub
		return (List<Registration>) registrationRepo.findAll();
	}

}
