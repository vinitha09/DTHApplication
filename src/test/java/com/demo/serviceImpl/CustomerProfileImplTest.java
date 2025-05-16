
package com.demo.serviceImpl;

import com.demo.Enum.enums.*;
import com.demo.entity.Address;
import com.demo.entity.CustomerProfile;
import com.demo.repository.CustomerProfileRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class CustomerProfileImplTest {

    @Mock
    private CustomerProfileRepo customerProfileRepo;

    @InjectMocks
    private CustomerProfileImpl customerProfileImpl;

    @Test
    void saveCustomerProfile_ShouldSaveSuccessfully() {
       
        CustomerProfile profile = new CustomerProfile();
        profile.setCustomerProfileID(1);
        profile.setFirstName("John");
        profile.setLastName("Doe");
        profile.setEmail("john@example.com");
        profile.setGender(Gender.Female);
        profile.setAlterPhoneNumber(987654321);

        Address address = new Address();
        address.setAddressID(10);
        address.setCity("Mumbai");
        profile.setAddress(address);

        when(customerProfileRepo.save(profile)).thenReturn(profile);

       
        CustomerProfile savedProfile = customerProfileImpl.saveCustomerProfile(profile);

       
        assertNotNull(savedProfile);
        assertEquals("John", savedProfile.getFirstName());
        assertEquals("Mumbai", savedProfile.getAddress().getCity());
        verify(customerProfileRepo, times(1)).save(profile);
    }
    @Test
    void getAllProfiles_ShouldReturnList() {
        // Arrange
        CustomerProfile profile1 = new CustomerProfile();
        profile1.setCustomerProfileID(1);
        profile1.setFirstName("John");

        CustomerProfile profile2 = new CustomerProfile();
        profile2.setCustomerProfileID(2);
        profile2.setFirstName("Jane");

        List<CustomerProfile> profiles = List.of(profile1, profile2);
        when(customerProfileRepo.findAll()).thenReturn(profiles);

        // Act
        List<CustomerProfile> result = customerProfileImpl.getAllProfiles();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("John", result.get(0).getFirstName());
        assertEquals("Jane", result.get(1).getFirstName());
        verify(customerProfileRepo, times(1)).findAll();
    }

    
}
