package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.CustomerProfile;

@Repository
public interface CustomerProfileRepo extends MongoRepository<CustomerProfile, Integer> {
    // Add custom queries if needed
}