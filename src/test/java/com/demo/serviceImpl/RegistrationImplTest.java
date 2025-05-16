package com.demo.serviceImpl;


import com.demo.Enum.enums.*;

import com.demo.entity.Registration;
import com.demo.entity.SetupBox;
import com.demo.repository.RegistrationRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
public class RegistrationImplTest {

    @Mock
    private RegistrationRepo registrationRepo;

    @InjectMocks
    private RegistrationImpl registrationService;

    @Test
    void saveRegister_ShouldSaveSuccessfully() {
        
    	    // Arrange
    	    Registration registration = new Registration();
    	    registration.setReg_ID(1);
    	    registration.setIdProofType(IdProofType.VOTER_ID);


    	    SetupBox setupBox = new SetupBox();
    	    setupBox.setSetBoxId("SBX100");
    	    setupBox.setSetBoxType(SetupBoxType.HD);

    	    
    	    registration.setSetupBox(setupBox);

    	    when(registrationRepo.save(registration)).thenReturn(registration);

    	    // Act
    	    Registration saved = registrationService.saveRegister(registration);

    	    // Assert
    	    assertNotNull(saved);
    	    assertEquals(IdProofType.VOTER_ID ,saved.getIdProofType());
    	    assertEquals("SBX100", saved.getSetupBox().getSetBoxId());
    	    verify(registrationRepo, times(1)).save(registration);
    	}
    @Test
    void getAllRegisters_ShouldReturnList() {
        // Arrange
        SetupBox setupBox1 = new SetupBox();
        setupBox1.setSetBoxId("SBX100");
        setupBox1.setIpAddress("192.168.1.10");


        Registration reg1 = new Registration();
        reg1.setReg_ID(1);
        reg1.setSetupBox(setupBox1);

        SetupBox setupBox2 = new SetupBox();
        setupBox2.setSetBoxId("SBX200");
        setupBox2.setIpAddress("192.168.1.11");


        Registration reg2 = new Registration();
        reg2.setReg_ID(2);
        reg2.setSetupBox(setupBox2);

        List<Registration> mockList = List.of(reg1, reg2);

        when(registrationRepo.findAll()).thenReturn(mockList);
        List<Registration> result = registrationService.getAllRegisters();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("SBX100", result.get(0).getSetupBox().getSetBoxId());
        assertEquals("SBX200", result.get(1).getSetupBox().getSetBoxId());


        verify(registrationRepo, times(1)).findAll();
    }


    }
