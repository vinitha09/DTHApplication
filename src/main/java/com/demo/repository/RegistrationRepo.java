package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Registration;



@Repository
public interface RegistrationRepo extends MongoRepository<Registration, Integer> {
    // Add custom queries if needed
}

