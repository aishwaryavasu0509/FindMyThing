package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.BuisnessModule;

public interface BuissnessRepository extends MongoRepository<BuisnessModule,String>  {

}
