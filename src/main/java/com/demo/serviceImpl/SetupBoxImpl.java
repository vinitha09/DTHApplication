package com.demo.serviceImpl;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.SetupBox;
import com.demo.repository.SetUpBoxRepo;
import com.demo.service.ISetupBox;
@RequiredArgsConstructor
@Service

public class SetupBoxImpl implements ISetupBox {

	private final SetUpBoxRepo setUpBoxRepo;

	@Override
	public SetupBox saveSetup(SetupBox setupBox) {
		
		// TODO Auto-generated method stub
		return setUpBoxRepo.save(setupBox);
	}

	@Override
	public List<SetupBox> getSetup() {
		// TODO Auto-generated method stub
		return (List<SetupBox>) setUpBoxRepo.findAll();
	}

}
