package com.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Address;

@Repository
public interface AddressRepo extends MongoRepository<Address, Integer> {
    // No need to write any code, Spring Data handles everything
}
