package com.example.mongodb.repository;

import com.example.mongodb.domain.Owner;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MongoDemoRepo extends MongoRepository<Owner, String> {
    @Query(value = "{name: ?0}")
    Owner findOwnerByName(String name);
}
