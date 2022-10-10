package com.example.mongodb.serivce;

import com.example.mongodb.domain.Owner;
import com.example.mongodb.repository.MongoDemoRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoService {
  private final MongoDemoRepo repository;

  public MongoService(MongoDemoRepo repository) {
    this.repository = repository;
  }

  public Owner findOwnerByName(String name) {return repository.findOwnerByName(name);}

  public void createOwner(Owner owner){
    repository.save(owner);
  }

  public List<Owner> getOwners() {

    return repository.findAll();
  }
}
