package com.example.mongodb.controller;


import com.example.mongodb.domain.Owner;
import com.example.mongodb.serivce.MongoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
@Api(value = "MongoDemoController RESTful endpoints")
public class MongoDemoController {
    private final MongoService service;

    @Autowired
    public MongoDemoController(MongoService service) {
        this.service = service;
    }


    @GetMapping(value = "/{owner}")
    @ApiOperation(value = "Find games by category", response = Iterable.class)
    public Owner findOwnerByName(@PathVariable String owner) {
        return service.findOwnerByName(owner);
    }

    @PostMapping("/addOwner")
    public String saveOwner(@RequestBody Owner owner){
      service.createOwner(owner);

      return "Added Successfully";
  }

    @GetMapping("/allOwners")
    public List<Owner> getOwners(){
      return service.getOwners();
    }

}
