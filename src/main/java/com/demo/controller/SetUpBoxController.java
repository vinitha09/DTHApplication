package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.CustomerProfile;
import com.demo.entity.SetupBox;
import com.demo.repository.CustomerProfileRepo;
import com.demo.repository.SetUpBoxRepo;
import com.demo.service.ISetupBox;

@RestController
@RequestMapping("/setupbox")
public class SetUpBoxController {

	
	
		@Autowired
		private ISetupBox iSetupBox;
	   
	    @GetMapping("/getall")
	    public List<SetupBox> getSetup() {
	        return iSetupBox.getSetup();
	    }
	    
	    @PostMapping("/save")
	    public SetupBox saveSetup(@RequestBody SetupBox setupBox) {
	        return iSetupBox.saveSetup(setupBox);
	    }
	    
}
