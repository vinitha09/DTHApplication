package com.demo.serviceImpl;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import com.demo.Enum.enums.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.entity.SetupBox;
import com.demo.repository.SetUpBoxRepo;

@ExtendWith(MockitoExtension.class)  // ✅ This is required for @Mock and @InjectMocks to work
public class SetupBoxImplTest {

    @Mock
    private SetUpBoxRepo setUpBoxRepo;

    @InjectMocks
    private SetupBoxImpl setupBoxService;

    @Test
    void saveSetup_ShouldSaveSuccessfully() {
        // Arrange
        SetupBox setupBox = new SetupBox();
        setupBox.setSetBoxId("SBX101");
        setupBox.setIpAddress("10.0.0.1");
        setupBox.setSetBoxType(SetupBoxType.HD);
        setupBox.setSoftware("v3.2");
        setupBox.setStatus(Status.ACTIVE);
        setupBox.setVersion("3.2.1");

        when(setUpBoxRepo.save(setupBox)).thenReturn(setupBox);

        // Act
        SetupBox savedSetupBox = setupBoxService.saveSetup(setupBox);

        // Assert
        assertNotNull(savedSetupBox);
        assertEquals("SBX101", savedSetupBox.getSetBoxId());

        verify(setUpBoxRepo, times(1)).save(setupBox);
    }

    @Test
    void getSetup_ShouldReturnAllSetupBoxes() {
        // Arrange
        SetupBox box1 = new SetupBox();
        box1.setSetBoxId("SBX201");
        box1.setStatus(Status.ACTIVE);

        SetupBox box2 = new SetupBox();
        box2.setSetBoxId("SBX202");
        box2.setStatus(Status.INACTIVE);

        List<SetupBox> mockList = List.of(box1, box2);
        when(setUpBoxRepo.findAll()).thenReturn(mockList);

        // Act
        List<SetupBox> result = setupBoxService.getSetup();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("SBX201", result.get(0).getSetBoxId());
        assertEquals(Status.INACTIVE, result.get(1).getStatus());
        verify(setUpBoxRepo, times(1)).findAll();
    }
}

