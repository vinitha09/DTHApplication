package com.demo.service;

import java.util.List;

import com.demo.entity.Registration;
import com.demo.entity.SetupBox;

public interface ISetupBox {
	SetupBox saveSetup(SetupBox setupBox);
	List<SetupBox> getSetup();

}
