package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.demo.entity.SetupBox;

@Repository
public interface SetUpBoxRepo extends MongoRepository<SetupBox, String> {
    // Add custom queries if needed
}
