package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.demo.entity.CustomerProfileSettings;

@Repository
public interface CustomerProfileSettingsRepo extends MongoRepository<CustomerProfileSettings, String> {
    // Add custom queries if needed
}
